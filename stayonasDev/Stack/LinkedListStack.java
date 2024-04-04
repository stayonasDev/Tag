package Tag.Stack;

import java.util.NoSuchElementException;

class Node<T>{
    private T data;
    private Node<T> node;

    public Node(){
        this.data = null;
        this.node = null;
    }
    public Node(T data){
        this.data = data;
        this.node = null;
    }
    public Node(T data, Node<T> node){
        this.data = data;
        this.node = node;
    }
    public T  getData(){
        return data;
    }
    public Node<T> getNode(){
        return node;
    }
    public void setNode(Node<T> node){
        this.node = node;
    }
}

class LinkedListStack<T>{
    private Node<T> top;

    public LinkedListStack(){
        this.top = null;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        if(top != null) {
            newNode.setNode(top);
            top = newNode;
        }else{
            top = newNode;
        }
    }

    public T pop(){
        if(top == null){
            // 스택이 비어있음을 알리는 예외를 발생시키거나 null을 반환
            throw new NoSuchElementException("스택이 비어있습니다.");
        }else{
            T data = top.getData();
            top = top.getNode();
            return data;
        }
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }

    public int search(T data){
        if(top == null){
            throw new NullPointerException("노드가 존재하지 않습니다.");
        }
        Node<T> temp = top;
        int index =1;
        while(temp != null){
            if(data.equals(temp.getData())){
                return index;
            }else{
                temp = temp.getNode();
                index++;
            }
        }
        return -1;
    }

    public T peek(){
        return top.getData();
    }
}
