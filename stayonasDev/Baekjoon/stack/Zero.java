package beakjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int element = 0;
        int count = Integer.parseInt(br.readLine());

        for(int i=0; count > i; i++){
            element = Integer.parseInt(br.readLine());
            if(element == 0)
                stack.pop(); //지울 수 있는 수 보장이기에 검증 필요X
            else
                stack.push(element);
        }

        int sum = stack.stream().mapToInt(x -> x).sum();
        System.out.println(sum);
    }
}
