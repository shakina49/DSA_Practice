class LinkedList(LinkedList):
    def remove_first(self):
        if self.head:
            self.head = self.head.next

    def remove_last(self):
        if not self.head:
            return
        if not self.head.next:
            self.head = None
            return
        curr = self.head
        while curr.next.next:
            curr = curr.next
        curr.next = None

    def remove_at_position(self, pos):
        if pos == 0:
            self.remove_first()
            return
        curr = self.head
        for _ in range(pos-1):
            if not curr.next:
                print("Position out of bounds")
                return
            curr = curr.next
        if curr.next:
            curr.next = curr.next.next

# Driver
ll = LinkedList()
n = int(input("Enter number of elements: "))
for _ in range(n):
    ll.append(int(input()))

ll.remove_first()
ll.remove_last()

pos = int(input("Enter position to remove: "))
ll.remove_at_position(pos)

print("LinkedList after deletions:")
ll.display()
