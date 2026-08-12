import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = 0;

        for (int i = 0; i < N; i++){
            for (int j = i+1; j < N; j++){
                int temp = arr[j] - arr[i];
                if (answer < temp){
                    answer = temp;
                }
            }
        }

        System.out.println(answer);

    }
}