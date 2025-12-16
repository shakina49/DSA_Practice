n = int(input("Enter size of array: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))

i, j = 0, n - 1
while i < j:
    arr[i], arr[j] = arr[j], arr[i]
    i += 1
    j -= 1

print("Reversed array:", arr)
