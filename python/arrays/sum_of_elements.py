n = int(input("Enter size of array: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))

sum_val = 0
for num in arr:
    sum_val += num

print("Sum of elements:", sum_val)
