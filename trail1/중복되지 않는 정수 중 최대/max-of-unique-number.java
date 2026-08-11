import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = -1;

        for (int num : arr){
            if (max < num){
                int cnt = 0;
                for (int j : arr){
                    if (j == num){
                        cnt++;
                    }
                }
                if (cnt == 1){
                    max = num;
                }
            }
        }

        System.out.println(max);

    }
}