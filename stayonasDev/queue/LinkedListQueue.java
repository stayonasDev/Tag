package Tag.queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}

class Node<E> {
    private E data;
    private Node<E> node;

    public Node(E data) {
        this.data = data;
        this.node = null;
    }
    public Node(){
        this.data = null;
        this.node = null;
    }

    public E getData() {
        return data;
    }

    protected void setData(E data) {
        this.data = data;
    }

    public Node<E> getNode() {
        return node;
    }

    protected void setNode(Node node) {
        this.node = node;
    }
}
    class LinkedQueue<E>{
        private Node<E> front;
        private Node<E> rear;
        private int size;

        LinkedQueue(){
            front = null;
            rear = null;
            size = 0;
        }

        public boolean offer(E data){
            Node<E> node = new Node<>(data);
            if(size == 0){
                front = node;
            }else{
                rear.setNode(node);
            }
            rear = node;
            size ++;
            return true;
        }

        public E peek(){
            return front.getData();
        }

        public E poll(){
            if(size == 0){
                return null;
            }
            E data = front.getData();
            Node<E> tempNode = front.getNode();
            front.setData(null);
            front.setNode(null);
            size--;
            front = tempNode;
            return data;
        }
    }
