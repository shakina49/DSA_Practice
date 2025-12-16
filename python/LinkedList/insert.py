class LinkedList(LinkedList):
    def add_first(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def add_at_position(self, data, pos):
        if pos == 0:
            self.add_first(data)
            return
        new_node = Node(data)
        curr = self.head
        for _ in range(pos-1):
            if curr is None:
                print("Position out of bounds")
                return
            curr = curr.next
        new_node.next = curr.next
        curr.next = new_node

# Driver
ll = LinkedList()
n = int(input("Enter number of elements: "))
print("Enter elements:")
for _ in range(n):
    ll.append(int(input()))

ll.add_first(int(input("Enter element to insert at beginning: ")))
ll.append(int(input("Enter element to insert at end: ")))

pos = int(input("Enter position to insert at (0-based): "))
val = int(input("Enter value to insert: "))
ll.add_at_position(val, pos)

print("LinkedList after insertions:")
ll.display()
