n = int(input("Enter size of array: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))

ascending = descending = True
for i in range(n-1):
    if arr[i] > arr[i+1]:
        ascending = False
    if arr[i] < arr[i+1]:
        descending = False

if ascending:
    print("Array is sorted in ascending order.")
elif descending:
    print("Array is sorted in descending order.")
else:
    print("Array is NOT sorted.")
