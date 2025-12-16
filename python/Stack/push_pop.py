stack = []
n = int(input("Enter number of elements to push: "))

print("Enter elements:")
for _ in range(n):
    stack.append(int(input()))

print("Stack after push:", stack)

m = int(input("Enter number of elements to pop: "))
for _ in range(m):
    if stack:
        popped = stack.pop()
        print("Popped element:", popped)
    else:
        print("Stack is empty")

print("Stack after pop:", stack)
