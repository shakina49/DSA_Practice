size = int(input("Enter size of circular queue: "))
cq = [None]*size
front = rear = -1

while True:
    print("\n1.Enqueue 2.Dequeue 3.Display 4.Exit")
    choice = int(input("Enter choice: "))

    if choice == 1:  # Enqueue
        next_pos = (rear + 1) % size
        if next_pos == front:
            print("Circular Queue Overflow!")
        else:
            element = int(input("Enter element to enqueue: "))
            if front == -1:
                front = 0
            rear = next_pos
            cq[rear] = element
    elif choice == 2:  # Dequeue
        if front == -1:
            print("Circular Queue Underflow!")
        else:
            print("Dequeued:", cq[front])
            if front == rear:
                front = rear = -1
            else:
                front = (front + 1) % size
    elif choice == 3:  # Display
        if front == -1:
            print("Queue is empty")
        else:
            i = front
            elements = []
            while True:
                elements.append(cq[i])
                if i == rear:
                    break
                i = (i + 1) % size
            print("Circular Queue elements:", elements)
    elif choice == 4:
        break
    else:
        print("Invalid choice")
