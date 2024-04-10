package beakjoon.Math;

import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int result = in.nextInt();
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            int price = in.nextInt();
            int pcount = in.nextInt();
            sum += price * pcount;
        }

        if (sum == result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}