package Tag.Stack;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int size = 0;
        
        for (int i = 0; i < 5; i++) {
            stack.push(i); //Top 삽입
            stack.peek(); //Top 보기
        }
        System.out.println("Stack is Empty? : " + stack.empty());
        System.out.println("POP Top in the Stack : " + stack.pop());
        System.out.println("Search 4 in Stack : " + stack.search(0));

        System.out.println(stack.size());
        size = stack.size();
        //for 문에서 stack.size()는 계속 실행하기에 i는 증가하고 stack.size()는 줄어들기에 변수 값에 저장
        for(int i=0; i < size; i++ ){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        System.out.println("Stack is Empty? : " + stack.empty());
    }
}
