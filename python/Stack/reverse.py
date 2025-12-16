stack = []
n = int(input("Enter number of elements to push: "))

print("Enter elements:")
for _ in range(n):
    stack.append(int(input()))

print("Original Stack:", stack)

stack.reverse()  # brutal shortcut
print("Reversed Stack:", stack)
