
//implement Queue using Array in Java language
public class Queue
{
    private int array[];
    private int head;
    private int tail;
    private int capacity;
    private int count;

    //Constructor to initialize queue with size parameter
    Queue(int size)
    {
        array = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    private int size()
    {
        return count;
    }

    private Boolean isEmpty()
    {
        return (size() == 0);
    }

    private Boolean isFull()
    {
        return (size() == capacity);
    }

    //Insert new item into the queue
    private void enqueue(int item)
    {
        if(isFull()){
            System.out.println("The queue is Full, no item is inserted");
            System.exit(1);
        }
        tail = (tail + 1);
        array[tail] = item;
        count++;
    }

    //Remove item from the queue
    private void dequeue()
    {
        if(isEmpty()){
            System.out.println("The queue is Empty, no item is removed");
            System.exit(1);
        }

        head = (head + 1) % capacity;
        count--;
    }

    //Return the head or front item in the queue without removing it
    private int peek()
    {
        if(isEmpty()){
            System.out.println("The queue is Empty");
            System.exit(1);
        }

        return array[head];
    }

    public static void main (String[] args)
    {
        Queue queue = new Queue(6);
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.enqueue(3);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(12);
        System.out.println("Queue size is " + queue.size());
        System.out.println("Head item is " + queue.peek());
        queue.dequeue();
        System.out.println("Queue size is " + queue.size());
        System.out.println("Head item is " + queue.peek());
        queue.dequeue();
        System.out.println("Queue size is " + queue.size());
    }
}
