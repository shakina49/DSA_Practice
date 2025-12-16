s = input("Enter a string: ")

# Convert to list and reverse using two pointers
arr = list(s)
i, j = 0, len(arr) - 1
while i < j:
    arr[i], arr[j] = arr[j], arr[i]
    i += 1
    j -= 1

reversed_str = ''.join(arr)
print("Reversed string:", reversed_str)
