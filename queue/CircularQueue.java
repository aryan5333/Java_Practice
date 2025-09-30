public class CircularQueue {
   private int[] queue;
        private int currSize;
        private int front,rear;
        private int capacity;
        private int size;

        public CircularQueue(int capacity){
            queue= new int[capacity];
            front=0;
            rear=-1;
            size=0;
            this.capacity=capacity;

        }
        public void enqueue(int data){
            if(size==capacity){
                System.out.println("Queue is full");
                return;
            }
            rear=(rear+1)%capacity;
            queue[rear]=data;
            return;
        }
        public int dequeue(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int data=queue[front];
            front=(front+1)%capacity;
            size--;
            return data;
        }
    
}
