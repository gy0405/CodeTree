import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cnt = new int[10];

        for(int num : arr){
            if (num == 0){
                break;
            }
            cnt[num/10]++;
        }

        for (int i = 1; i < 10; i++){
            System.out.printf("%d - %d\n", i, cnt[i]);
        }
    }
}