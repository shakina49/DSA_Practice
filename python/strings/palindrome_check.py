s = input("Enter a string: ")

arr = list(s)
i, j = 0, len(arr) - 1
is_palindrome = True

while i < j:
    if arr[i] != arr[j]:
        is_palindrome = False
        break
    i += 1
    j -= 1

if is_palindrome:
    print("The string is a palindrome.")
else:
    print("The string is NOT a palindrome.")
