import java.util.*;
import java.io.*;

public class Main {
    public static int n, answer;
    public static int[] numbers;

    public static boolean notCarry(int a, int b, int c){
        int numA = numbers[a];
        int numB = numbers[b];
        int numC = numbers[c];

        while(numA > 0 || numB > 0 || numC > 0){
            if(numA % 10 + numB % 10 + numC % 10 >= 10){
                return false;
            }

            numA /= 10;
            numB /= 10;
            numC /= 10;
        }

        return true;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        answer = -1;
        numbers = new int[n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for(int a = 0; a < n - 2; a++){
            for(int b = a + 1; b < n - 1; b++){
                for(int c = b + 1; c < n; c++){
                    if(notCarry(a, b, c)){
                        int temp = numbers[a] + numbers[b] + numbers[c];
                        //System.out.println(a + " " + b + " " + c);
                        answer = Math.max(answer, temp);
                    }
                }
            }
        }

        System.out.println(answer);

    }
}