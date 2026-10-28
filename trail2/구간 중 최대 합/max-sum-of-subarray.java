import java.util.*;
import java.io.*;

public class Main {
    public static int n, k, answer;
    public static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i <= n-k; i++){
            int temp = 0;

            for(int j = 0; j < k; j++){
                temp += arr[i + j];
            }

            answer = Math.max(answer, temp);
        }

        System.out.println(answer);

    }
}