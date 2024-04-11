package beakjoon.stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack; 
        int count = Integer.parseInt(br.readLine());
        boolean flag;

        while(count > 0) {
            stack = new Stack<>();  //오버해드가 발생할 것 같은데 생각해보자
            String bracketList = br.readLine();
            flag = true;

            for (int i = 0; i < bracketList.length(); i++) {
                if (bracketList.charAt(i) == '(') {
                    stack.push((char) bracketList.indexOf(i));
                }else if(bracketList.charAt(i) == ')')
                    if(!stack.isEmpty()) {
                        stack.pop();
                    } else{
                        flag = false;
                        break;
                    }

            }

            System.out.println(flag ? stack.isEmpty() ? "YES" :  "NO" : "NO");
            count--;
        }
    }
}
