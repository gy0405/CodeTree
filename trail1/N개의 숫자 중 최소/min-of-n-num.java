import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = arr[0];
        int cnt = 0;

        for (int num : arr){
            if (min > num){
                min = num;
            }
        }

        for (int num : arr){
            if (min == num){
                cnt++;
            }
        }

        System.out.printf("%d %d", min, cnt);

    }
}