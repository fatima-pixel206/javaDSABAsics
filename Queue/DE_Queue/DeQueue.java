package If_Else.Queue.DE_Queue;



public class DeQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor: Initialize empty deque
    public DeQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = -1;  // Empty deque indicator
        this.rear = -1;
        this.size = 0;
    }

    // ✅ METHOD 1: Insert at Front
    public void insertFront(int value) {
        if (isFull()) {
            System.out.println("❌ DeQueue is Full! Cannot insert at front.");
            return;
        }

        if (front == -1) {
            // First element
            front = 0;
            rear = 0;
            arr[front] = value;
        } else if (front == 0) {
            // Shift all elements right
            for (int i = rear; i >= front; i--) {
                arr[i + 1] = arr[i];
            }
            arr[front] = value;
            rear++;
        } else {
            // Front is not at 0, so just decrement
            front--;
            arr[front] = value;
        }
        size++;
        System.out.println("✅ Inserted " + value + " at Front");
    }

    // ✅ METHOD 2: Insert at Rear
    public void insertRear(int value) {
        if (isFull()) {
            System.out.println("❌ DeQueue is Full! Cannot insert at rear.");
            return;
        }

        if (rear == -1) {
            // First element
            front = 0;
            rear = 0;
            arr[rear] = value;
        } else if (rear == capacity - 1) {
            System.out.println("❌ Cannot insert at rear. Array boundary reached.");
            return;
        } else {
            rear++;
            arr[rear] = value;
        }
        size++;
        System.out.println("✅ Inserted " + value + " at Rear");
    }

    // ✅ METHOD 3: Delete from Front
    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("❌ DeQueue is Empty! Cannot delete from front.");
            return -1;
        }

        int deletedValue = arr[front];

        if (front == rear) {
            // Only one element
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        size--;
        System.out.println("✅ Deleted " + deletedValue + " from Front");
        return deletedValue;
    }

    // ✅ METHOD 4: Delete from Rear
    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("❌ DeQueue is Empty! Cannot delete from rear.");
            return -1;
        }

        int deletedValue = arr[rear];

        if (front == rear) {
            // Only one element
            front = -1;
            rear = -1;
        } else {
            rear--;
        }
        size--;
        System.out.println("✅ Deleted " + deletedValue + " from Rear");
        return deletedValue;
    }

    // ✅ METHOD 5: Get Front Element (without deleting)
    public int getFront() {
        if (isEmpty()) {
            System.out.println("❌ DeQueue is Empty!");
            return -1;
        }
        return arr[front];
    }

    // ✅ METHOD 6: Get Rear Element (without deleting)
    public int getRear() {
        if (isEmpty()) {
            System.out.println("❌ DeQueue is Empty!");
            return -1;
        }
        return arr[rear];
    }

    // ✅ METHOD 7: Check if Empty
    public boolean isEmpty() {
        return size == 0;
    }

    // ✅ METHOD 8: Check if Full
    public boolean isFull() {
        return size == capacity;
    }

    // ✅ METHOD 9: Get Size
    public int getSize() {
        return size;
    }

    // ✅ METHOD 10: Display All Elements
    public void display() {
        if (isEmpty()) {
            System.out.println("❌ DeQueue is Empty!");
            return;
        }
        System.out.print("DeQueue Elements: [");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i]);
            if (i < rear) System.out.print(", ");
        }
        System.out.println("]");
    }

    // ✅ METHOD 11: Clear the DeQueue
    public void clear() {
        front = -1;
        rear = -1;
        size = 0;
        System.out.println("✅ DeQueue Cleared!");
    }

    // ✅ METHOD 12: Display Stats
    public void displayStats() {
        System.out.println("📊 DeQueue Stats:");
        System.out.println("   Capacity: " + capacity);
        System.out.println("   Current Size: " + size);
        System.out.println("   Is Empty? " + isEmpty());
        System.out.println("   Is Full? " + isFull());
    }
}
