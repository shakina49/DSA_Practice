n = int(input("Enter size of array (>=2): "))
if n < 2:
    print("Array must have at least 2 elements!")
    exit()

arr = list(map(int, input(f"Enter {n} elements: ").split()))

first = second = float('-inf')
for num in arr:
    if num > first:
        second = first
        first = num
    elif num > second and num != first:
        second = num

if second == float('-inf'):
    print("No second largest element (all elements equal).")
else:
    print("Second largest element:", second)
