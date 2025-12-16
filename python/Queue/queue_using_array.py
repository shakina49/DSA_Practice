queue = []
size = int(input("Enter size of queue: "))

while True:
    print("\n1.Enqueue 2.Dequeue 3.Display 4.Exit")
    choice = int(input("Enter choice: "))

    if choice == 1:  # Enqueue
        if len(queue) >= size:
            print("Queue Overflow!")
        else:
            element = int(input("Enter element to enqueue: "))
            queue.append(element)
    elif choice == 2:  # Dequeue
        if not queue:
            print("Queue Underflow!")
        else:
            print("Dequeued:", queue.pop(0))
    elif choice == 3:  # Display
        if not queue:
            print("Queue is empty")
        else:
            print("Queue elements:", queue)
    elif choice == 4:
        break
    else:
        print("Invalid choice")
