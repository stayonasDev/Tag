package Tag.Stack;

public class SimpleListStackApp {
    public static void main(String[] args) {
        ArrayListStack<Integer> stack = new ArrayListStack<>();

//        stack.push(1);
//        System.out.println(stack.pop());
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.pop());
//
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
        // null 반환
//        System.out.println(stack.search(2));

        //사용
        for(int i=0; i < 5; i++){
            stack.push(i);
            System.out.println("head in Stack : " +  stack.peek());
        }
        System.out.println();
        System.out.println("where is a number three in the Stack? : " + stack.search(3));
        System.out.println("what is top in stack? : " + stack.peek());
        System.out.print("pop in the stack : " + stack.pop());

        while(!stack.isEmpty()){
            System.out.print(", " + stack.pop());
        }

        System.out.println();
        System.out.println("Stack is Empty? : " + stack.isEmpty());
    }
}
