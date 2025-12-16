class LinkedList(LinkedList):
    def reverse(self):
        prev = None
        curr = self.head
        while curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        self.head = prev

# Driver
ll = LinkedList()
n = int(input("Enter number of elements: "))
for _ in range(n):
    ll.append(int(input()))

print("Original LinkedList:")
ll.display()

ll.reverse()
print("Reversed LinkedList:")
ll.display()
