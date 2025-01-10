//Circular queue using array

public class Circular_queue_array {
    static class CircularQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CircularQueue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty()
        {
            return rear == -1;
        }

        //full array condition
        public static boolean isFull()
        {
            return (rear+1) % size == front;
        }

        //Enqueue
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }
            if(front  == -1)
            {
                front = 0;
            }

            rear = (rear +1) % size;
            arr[rear] = data;
        }

        //Dequeue
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty");
                return -1;
            }

            int result = arr[front];
            //Last element remaing deleting
            if(rear == front)
            {
                rear = front = -1;
            }else{
                front = (front +1) % size;
            }
            return result;
        }

        //Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args)
    {
        CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);

        while(!cq.isEmpty())
        {
            System.out.println(cq.peek());
            cq.remove();
        }
        cq.remove();
        cq.add(0);
        System.out.println(cq.peek());
    }
}
