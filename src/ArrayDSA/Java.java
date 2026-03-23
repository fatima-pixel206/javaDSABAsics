package ArrayDSA;
class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // 1. isEmpty()
    public boolean isEmpty() {
        return top == -1;
    }

    // 2. isFull()
    public boolean isFull() {
        return top == capacity - 1;
    }

    // 3. push()
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            //
            //
            // return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    // 4. pop()
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Nothing to pop");
            return -1;
        }
        return arr[top--];
    }

    // 5. peek()
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // 6. capacity()
    public int capacity() {
        return capacity;
    }

    // 7. size()
    public int size() {
        return top + 1;
    }
}

// Main class to test
public class Java {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack capacity: " + stack.capacity());
    }
}
