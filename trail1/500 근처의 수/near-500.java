import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 1;
        int min = 1000;

        for (int num : arr){
            if (num > 500){
                if (min > num){
                    min = num;
                }
            }
            else {
                if(num > max){
                    max = num;
                }
            }
        }

        System.out.printf("%d %d", max, min);

    }
}