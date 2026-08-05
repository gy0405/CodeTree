import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cnt = new int[6];

        for(int num : arr){
            cnt[num-1]++;
        }

        for (int i = 0; i < 6; i++){
            System.out.printf("%d - %d\n", i+1, cnt[i]);
        }
    }
}