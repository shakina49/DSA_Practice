def reverse_string(s):
    if s == "":
        return ""
    return reverse_string(s[1:]) + s[0]

s = input("Enter a string: ")
print("Reversed string:", reverse_string(s))
