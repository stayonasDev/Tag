package Tag.Stack;

public class SimpleListStack {
    public static void main(String[] args) {
        SimpleList<Integer> stack = new SimpleList<>(5);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack.peek() : " + stack.peek());
        System.out.println("Stack.pop() : " + stack.pop());
        System.out.println("Stack.pop()" + stack.pop());
//        System.out.println("Stack.pop() Exception : " + stack.pop());
        System.out.println("Stack.empty() : " + stack.empty());

        stack.push(4);
        System.out.println("Stack.empty() : " + stack.empty());

    }
}

class SimpleList<T>{
  private int top;
  private T[] stackList;

  SimpleList(int capacity){
      stackList = (T[]) new Object[capacity];
      top = -1; // 스택이 비어있는 상태
    }
    public void push(T item){
      stackList[++top] = item;
    }

    public T pop(){
      if(top < 0){
          System.out.println("in Stack is Empty");
          throw new IndexOutOfBoundsException("Stack is Empty");
      }
      T item = stackList[top];
      stackList[top--] = null;
      return item;
    }

    public T peek(){
      return stackList[top];
    }

    //스택 안에 요소 보다 Top이 어느 곳을 가르키는지 확인하면
    //복잡하게 풀 필요 없다 생각하여 top의 값이 0 미만이면 비어있다.
    public boolean empty(){
      if(top > -1){
          return false;
      }else{
          return true;
      }
    }
}
