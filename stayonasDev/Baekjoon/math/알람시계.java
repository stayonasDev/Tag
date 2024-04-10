package beakjoon.Math;

import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();

        if (45 > m) {
            h -= 1;
            m += 15;
            if(h == -1)
                h = 23;
        } else
            m -= 45;
        System.out.println(h + " " + m);
    }
}