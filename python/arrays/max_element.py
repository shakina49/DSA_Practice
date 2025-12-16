n = int(input("Enter size of array: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))

max_val = arr[0]
for num in arr[1:]:
    if num > max_val:
        max_val = num

print("Maximum element:", max_val)
