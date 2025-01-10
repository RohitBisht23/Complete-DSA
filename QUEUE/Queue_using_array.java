//QUEUE using array
public class Queue_using_array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        //Constructor
        Queue(int n)
        {
            arr = new int[n]; // size of array define
            size = n;
            rear = -1; // when queue is empty
        }

        //checking is queue is empty or not
        public static boolean isEmpty()
        {
            return rear == -1; //return true if queue is full else  false 
        }

        //Add/Enqueue 
        public static void add(int data)
        {
            //check if queue is full
            if(rear  == size -1)
            {
                System.out.println("Queue is full");
                return;
            }

            rear = rear +1;
            arr[rear] = data;
        }

        //Remove/Dequeue 
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is already empty");
                return -1;
            }
            int front = arr[0]; //Note front is always at index 0
            for(int i=0; i<rear; i++)
            {
                arr[i] = arr[i+1];
            }
            rear = rear -1;
            return front;
        }

        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Nothing");
                return -1;
            }
            return arr[0]; //arr[0] is always a front
        }

    }
    public static void main(String args[])
    {
        Queue q = new Queue(5); // 5 is the size of the queue array
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);//By this data queue return queue is full because size were 5 can't add other than 5 elements

        while(!q.isEmpty())
        {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
