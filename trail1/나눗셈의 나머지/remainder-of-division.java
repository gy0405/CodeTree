import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cnt = new int[arr[1]];
        int sum = 0;

        int A = arr[0];
        int B = arr[1];

        while(A > 1){
            cnt[A % B]++;
            A = A / B;
        }

        for (int num : cnt){
            sum += num * num;
        }

        System.out.println(sum);

    }
}