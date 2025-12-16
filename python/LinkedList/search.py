class LinkedList(LinkedList):
    def search(self, key):
        curr = self.head
        index = 0
        while curr:
            if curr.data == key:
                return index
            curr = curr.next
            index += 1
        return -1

# Driver
ll = LinkedList()
n = int(input("Enter number of elements: "))
for _ in range(n):
    ll.append(int(input()))

key = int(input("Enter element to search: "))
index = ll.search(key)
if index != -1:
    print(f"Element found at index: {index}")
else:
    print("Element not found")

