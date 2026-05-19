import xml.etree.ElementTree as ET
import turtle
import math

# --- Configuration ---
XMI_FILE = 'OutputTurtle.xmi'
SCALE_FACTOR = 10  # Reduced slightly to keep it on screen
START_Y = -250     # Starting position at the bottom of the window

# Branch Colors
COLOR_LEFT = "#ff6b6b"  # Reddish
COLOR_RIGHT = "#4ecdc4" # Teal

# --- The Turtle's Brain ---
env = {"x": 0.0, "y": 0.0, "dx": 0.0, "dy": 0.0, "theta": 0.0}
branch_count = 0

def get_node_type(node):
    xsi_type = node.attrib.get('{http://www.w3.org/2001/XMLSchema-instance}type')
    if xsi_type:
        return xsi_type.split(':')[-1]
    tag = node.tag.split('}')[-1] if '}' in node.tag else node.tag
    return tag

def get_child(node, tag_name):
    for child in node:
        if child.tag.endswith(tag_name):
            return child
    return None

def eval_expr(node):
    if node is None: return 0.0
    ntype = get_node_type(node)
    
    if ntype == 'RealConst':
        return float(node.attrib.get('value', 0))
    elif ntype == 'VarRef':
        var_name = node.attrib.get('var') or node.attrib.get('_var')
        return env.get(var_name, 0.0)
    elif ntype == 'Binary':
        op = node.attrib.get('operation')
        left = eval_expr(get_child(node, 'left'))
        right = eval_expr(get_child(node, 'right'))
        if op == 'SUBTRACT': return left - right
        if op == 'ADD': return left + right
        if op == 'DIVISION': return left / right if right != 0 else 0
        if op == 'LT': return left < right
    elif ntype in ['Sqr', 'Sqrt', 'Arctan', 'Abs']:
        val = eval_expr(get_child(node, 'expr'))
        if ntype == 'Sqr': return val * val
        if ntype == 'Sqrt': return math.sqrt(val)
        if ntype == 'Arctan': return math.degrees(math.atan(val))
        if ntype == 'Abs': return abs(val)
    return 0.0

def execute_statement(node, t):
    global branch_count
    if node is None: return

    ntype = get_node_type(node)
    
    if ntype == 'Assignment':
        var_name = node.attrib.get('var') or node.attrib.get('_var')
        val = eval_expr(get_child(node, 'expr'))
        
        # Detect Reset (X goes to 0 after we've already moved)
        if var_name == 'x' and val == 0.0 and (abs(env['x']) > 0.1 or abs(env['y']) > 0.1):
            branch_count += 1
            t.penup()  # LIFT PEN FIRST
            
            # Switch Colors
            colors = ["#bb86fc", "#4ecdc4", "#ffb86c", "#ff6b6b"]
            t.color(colors[branch_count % len(colors)])
            
            t.goto(0, START_Y)  # MOVE WHILE PEN IS UP
            print(f"--- Teleporting for Branch {branch_count} ---")
            
        env[var_name] = val
        
        # IMPORTANT: Do NOT put pendown() here. 
        # Let the 'Move' command handle putting the pen down.
        
    elif ntype == 'Move':
        # BRUTE FORCE: Ensure pen is down before moving
        if not t.isdown():
            t.pendown()
        
        dist = eval_expr(get_child(node, 'expr'))
        t.forward(dist * SCALE_FACTOR)
        print(f"Moving {dist} units...")

    elif ntype == 'TurnToZero':
        t.setheading(90)
    
    elif ntype in ['TurnLeft', 'TurnRight']:
        angle = eval_expr(get_child(node, 'expr'))
        if ntype == 'TurnLeft': t.left(angle)
        else: t.right(angle)
        
    elif ntype == 'If':
        cond_val = eval_expr(get_child(node, 'cond'))
        # Source 2 shows 'then' and 'else' as reference names
        if cond_val:
            execute_statement(get_child(node, 'then') or get_child(node, '_then'), t)
        else:
            execute_statement(get_child(node, 'else') or get_child(node, '_else'), t)

def main():
    tree = ET.parse(XMI_FILE)
    root = tree.getroot()

    screen = turtle.Screen()
    screen.setup(width=800, height=800) # Force a larger window
    screen.bgcolor("#1e1e1e")
    
    t = turtle.Turtle()
    t.speed(3)
    t.color(COLOR_LEFT)
    t.penup()
    t.goto(0, START_Y) # Start at the bottom center
    t.pendown()
    t.setheading(90)

    for statement in root.findall('.//*'):
        if 'statements' in statement.tag:
            execute_statement(statement, t)

    turtle.done()

if __name__ == '__main__':
    main()