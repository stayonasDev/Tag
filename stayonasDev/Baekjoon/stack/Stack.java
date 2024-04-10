package beakjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayStack arrayStack;
        StringTokenizer st;
        String input;
        int count = 0;

        count = Integer.parseInt(br.readLine());
        arrayStack = new ArrayStack(count);

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            switch (input= st.nextToken()) {
                case "push" :
                    int item = Integer.parseInt(st.nextToken());
                    arrayStack.push(item);
                    break;
                case "pop" :
                    System.out.println(arrayStack.pop());
                    break;
                case "size":
                    System.out.println(arrayStack.size());
                    break;
                case "empty" :
                    System.out.println(arrayStack.empty());
                    break;
                case "top":
                    System.out.println(arrayStack.top());
                    break;
            }
        }
    }
}

class ArrayStack{
    private int[] arrayList;

    private int top;
    private  int capacity;

    public ArrayStack(int capacity){
        arrayList = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }

    public void push(int data){
        if(top+1 >= capacity){
            throw new IndexOutOfBoundsException();
        }
        arrayList[++top] = data;
    }

    public int pop(){
        if(top < 0){
            return -1;
        }
        int item = arrayList[top];
        arrayList[top--] = 0;
        return item;
    }

    public int size(){
        if(top < 0){
            return 0;
        }
        return top + 1;
    }

    public int empty(){
        if(top < 0){
            return 1;
        }
        return 0;
    }

    public int top(){
        if(top < 0){
            return -1;
        }
        return arrayList[top];
    }

}
