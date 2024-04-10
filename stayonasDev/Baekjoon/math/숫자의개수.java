package beakjoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 숫자의개수{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int number = 1;
        int e;
        String value = "";


        for(int i=0; i<3;i++){
            number *= Integer.parseInt(br.readLine());
        }
        value = String.valueOf(number);

        //풀이는 계산하여 나오는 수에서 지수를 알면 쉽게 풀 수 있다 생각 함
        // 만약 결과가 1234이라면 10의 3승
        //1234을 10의 3승 나누기 몫은 1, 1 나누기 10의 나머지는 1
        // % 10을 다 붙인 이유는 내가 원하는 지수의 값 뒷자리만 얻을 수 있기 때문

        for(int i=0; i<value.length(); i++) {
            e = (int) Math.pow(10, value.length() - (1+i));
            numbers[(number / e) % 10] += 1;
        }

        for(int a : numbers){
            System.out.println(a);
        }
    }
}