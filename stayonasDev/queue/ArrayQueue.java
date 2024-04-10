package Tag.queue;
//큐 구현
public class ArrayQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(0);

        for(int i=0; i<5; i++){
            queue.offer(i); //Queue의 용량 늘어남
        }
        System.out.println("queue.poll = " + queue.poll());
        System.out.println("queue.poll = " + queue.poll());
        System.out.println("queue.remove = " + queue.remove());
        System.out.println("queue.remove = " + queue.remove());
        System.out.println("queue.peek = " + queue.peek());
        System.out.println("queue.poll = " + queue.poll());
        //데이터가 없다면 익셉션이 아닌 Null 반환
        System.out.println("queue.poll = " + queue.poll());

    }


}

class Queue<E>{
    private final int DEFAULT_CAPACITY = 64;
    private int front;
    private int rear;
    private Object[] queue;
    private int size;
    private int capacity;


    public Queue(){
        front = rear = size = 0;
        capacity = DEFAULT_CAPACITY;
        queue = new Object[capacity];
    }

    public Queue(int capacity){
        front = rear = size = 0;
        this.capacity = capacity;
        queue = new Object[capacity];
    }

    //offer 용량제한을 위반하지 않음 동시에 큐의 용량을 0으로 설정하여도 문제 없기 위해
    //size++; (capacity+1)
    public void increase(){
        capacity = (capacity + 1) * 2;

        Object[] temp = new Object[capacity];
        for(int i=0; i<size; i++){
            temp[i] = queue[i];
        }
        queue = temp.clone();
        temp = null;
        size++;
    }

    public boolean offer(E data){ //enqueue
        if(size >= capacity || size <= 0)
            increase();
        queue[rear % capacity] = data;
        rear++;
        size++;
        return true;
    }

    public E poll(){ //dequeue
        if(size <= 0)
            return null;
        E element = (E)queue[front % capacity];
        front++;
        size--;

        return element;
    }

    public E remove(){
        if(size <= 0)
            throw new NullPointerException();
        E data = (E) queue[front % capacity];
        queue[front % capacity] = null;
        front++;
        return data;
    }

    public E peek(){
        if(size <= 0)
            throw new NullPointerException();
        return (E)queue[front % capacity];
    }
}