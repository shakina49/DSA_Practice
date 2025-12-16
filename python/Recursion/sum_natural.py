def sum_natural(n):
    if n == 0:
        return 0
    return n + sum_natural(n - 1)

n = int(input("Enter a number: "))
print(f"Sum of first {n} natural numbers is: {sum_natural(n)}")
