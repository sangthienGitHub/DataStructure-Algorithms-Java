
public class Stack {
    private int[] items = new int[100];
    private int top = -1; //index to keep track of the topmost element

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == items.length -1;
    }

    /**
     * Insert Item into the stack
     */

    public void push(int item) {
        if (isFull()){
            System.out.println("Stack is full or Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + item);
        items[++top] = item;
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
        return items[top--];
    }

    /**
     * Returns the topmost item without removing it
     * Peek and Pop methods should ideally be invoked after checking that the stack is not empty
     * either in a 'if' condition or a 'while' loop
     * @return
     */
    public int peek() {
        if (isEmpty()){
            System.out.println("Stack is empty or Underflow");
            System.exit(1);
        }
        return items[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
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
    }
}
