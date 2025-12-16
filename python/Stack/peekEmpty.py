stack = []
n = int(input("Enter number of elements to push: "))

print("Enter elements:")
for _ in range(n):
    stack.append(int(input()))

if stack:
    print("Top element (peek):", stack[-1])
else:
    print("Stack is empty")

print("Is stack empty?", len(stack) == 0)
