# Linear Search in Python
n = int(input("Enter size of array: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))
key = int(input("Enter element to search: "))

index = -1
for i in range(n):
    if arr[i] == key:
        index = i
        break

if index != -1:
    print("Element found at index:", index)
else:
    print("Element not found in the array.")
