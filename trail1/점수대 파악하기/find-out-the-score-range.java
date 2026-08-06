import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cnt = new int[10];

        for(int num : arr){
            if(num == 0){
                break;
            }
            if(num < 10){
                continue;
            }
            cnt[num/10 - 1]++;
        }

        for (int i = 10; i > 0; i--){
            System.out.printf("%d - %d\n", (i)*10, cnt[i-1]);
        }

    }
}