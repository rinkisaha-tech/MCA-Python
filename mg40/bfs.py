from collections import deque

def bfs_shortest_path(graph, start, goal):
    queue = deque([[start]]) 
    visited = set() 
    while queue:
        path = queue.popleft() 
        vertex = path[-1] 

        if vertex == goal: 
            return path 

   
        if vertex not in visited: 
            visited.add(vertex)

            for neighbor in graph[vertex]:
                new_path = list(path)
                new_path.append(neighbor)
                queue.append(new_path)

    return None  

# graph = {
#     'A': ['B', 'C'],
#     'B': ['A', 'D'],
#     'C': ['A', 'F'],
#     'D': ['B', 'E'],
#     'E': ['D', 'F'],
#     'F': ['C', 'E'] 
# }

graph = {}

edges = int(input("Enter the number of edges: "))
print("Enter edges (format: u v):")
for _ in range(edges):
    u ,v = input().split()

    if u not in graph:
        graph[u] = []
    if v not in graph:
        graph[v] = []

        graph[u].append(v)
        graph[v].append(u)

start = input("Enter the start node: ")
goal = input("Enter the goal node: ")

print("\n Graph: ", graph)
print("Start Node: ", start)
print("Goal Node: ", goal)

path = bfs_shortest_path(graph, start, goal)
if path: 
    print("BFS traversal path: ", path)
else:
    print("No path is found", start, "to", goal)
