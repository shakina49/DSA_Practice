n = int(input("Enter size of array: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))

for i in range(n-1):
    swapped = False
    for j in range(n-1-i):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]
            swapped = True
    if not swapped:
        break

print("Sorted array:", arr)
