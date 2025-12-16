def reverse_subarray(arr, start, end):
    while start < end:
        arr[start], arr[end] = arr[end], arr[start]
        start += 1
        end -= 1

n = int(input("Enter size of array: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))
k = int(input("Enter number of positions to rotate: "))
direction = input("Rotate (L for left, R for right): ").upper()

k %= n
if direction == 'R':
    reverse_subarray(arr, 0, n-1)
    reverse_subarray(arr, 0, k-1)
    reverse_subarray(arr, k, n-1)
elif direction == 'L':
    reverse_subarray(arr, 0, k-1)
    reverse_subarray(arr, k, n-1)
    reverse_subarray(arr, 0, n-1)
else:
    print("Invalid direction!")
    exit()

print("Array after rotation:", arr)
