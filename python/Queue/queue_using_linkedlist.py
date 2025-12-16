class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Queue:
    def __init__(self):
        self.front = None
        self.rear = None

    def enqueue(self, data):
        new_node = Node(data)
        if not self.rear:
            self.front = self.rear = new_node
            return
        self.rear.next = new_node
        self.rear = new_node

    def dequeue(self):
        if not self.front:
            print("Queue Underflow!")
            return
        print("Dequeued:", self.front.data)
        self.front = self.front.next
        if not self.front:
            self.rear = None

    def display(self):
        if not self.front:
            print("Queue is empty")
            return
        curr = self.front
        elements = []
        while curr:
            elements.append(curr.data)
            curr = curr.next
        print("Queue elements:", elements)

# Driver
q = Queue()
while True:
    print("\n1.Enqueue 2.Dequeue 3.Display 4.Exit")
    choice = int(input("Enter choice: "))
    if choice == 1:
        element = int(input("Enter element to enqueue: "))
        q.enqueue(element)
    elif choice == 2:
        q.dequeue()
    elif choice == 3:
        q.display()
    elif choice == 4:
        break
    else:
        print("Invalid choice")
