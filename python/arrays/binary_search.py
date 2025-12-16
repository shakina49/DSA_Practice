n = int(input("Enter size of sorted array: "))
arr = list(map(int, input(f"Enter {n} elements in ascending order: ").split()))
key = int(input("Enter element to search: "))

left, right = 0, n - 1
index = -1
while left <= right:
    mid = left + (right - left) // 2
    if arr[mid] == key:
        index = mid
        break
    elif arr[mid] < key:
        left = mid + 1
    else:
        right = mid - 1

if index != -1:
    print("Element found at index:", index)
else:
    print("Element not found in the array.")
