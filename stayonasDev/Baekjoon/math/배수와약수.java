package beakjoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class 배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x, y;
        int root;

        while(true){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if(x == y) {
                break;
            }else if(x < y){
                root = (int)(y * 0.5);
                for(int i=1; i<root+1; i++){
                    if((x * i) == y){
                        System.out.println("factor");
                        break;
                    }
                    if (i >= root) {
                        System.out.println("neither");
                    }
                }
            }else {
                root = (int)(x * 0.5);
                for (int i = 1; i < root + 1; i++) {
                    if (y * i == x) {
                        System.out.println("multiple");
                        break;
                    }
                    if (i >= root) {
                        System.out.println("neither");
                    }
                }
            }

        }
    }
}