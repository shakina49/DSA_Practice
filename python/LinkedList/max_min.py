class LinkedList(LinkedList):
    def find_max(self):
        if not self.head:
            return None
        max_val = self.head.data
        curr = self.head.next
        while curr:
            if curr.data > max_val:
                max_val = curr.data
            curr = curr.next
        return max_val

    def find_min(self):
        if not self.head:
            return None
        min_val = self.head.data
        curr = self.head.next
        while curr:
            if curr.data < min_val:
                min_val = curr.data
            curr = curr.next
        return min_val

# Driver
ll = LinkedList()
n = int(input("Enter number of elements: "))
for _ in range(n):
    ll.append(int(input()))

print("LinkedList elements:")
ll.display()
print("Maximum element:", ll.find_max())
print("Minimum element:", ll.find_min())
