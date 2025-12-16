stack = []
n = int(input("Enter number of elements to push: "))

print("Enter elements:")
for _ in range(n):
    stack.append(int(input()))

if stack:
    max_val = max(stack)
    min_val = min(stack)
    print("Maximum element:", max_val)
    print("Minimum element:", min_val)
else:
    print("Stack is empty")
