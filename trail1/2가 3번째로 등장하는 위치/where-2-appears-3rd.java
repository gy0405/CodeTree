import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = 0;

        for (int i = 0; i < N; i++){
            if (arr[i] == 2){
                cnt++;
                if (cnt == 3){
                    System.out.println(i+1);
                }
            }
        }

    }
}