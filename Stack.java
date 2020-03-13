
public class Stack {
    private int array[];
    private int top;
    private int capacity;

    //Constructor to initialize stack
    Stack(int size){
        array = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == capacity -1;
    }

    public void push(int item) {
        if (isFull()){
            System.out.println("Stack is full or Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + item);
        array[++top] = item;
    }

    /**
     * Returns the topmost item and removes it
     * @return
     */
    public int pop() {
        if (isEmpty()){
            System.out.println("Stack is empty or Underflow");
            System.exit(1);
        }
        System.out.println("Removing " + peek());
        return array[top--];
    }

    /**
     * Returns the topmost item without removing it
     * @return
     */
    public int peek() {
        if (isEmpty()){
            System.out.println("Stack is empty or Underflow");
            System.exit(1);
        }
        return array[top];
    }

    public static void main(String[] args) {
        academy.training.Stack stack = new academy.training.Stack(7);
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
