n = int(input("Enter size of array: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))

min_val = arr[0]
for num in arr[1:]:
    if num < min_val:
        min_val = num

print("Minimum element:", min_val)
