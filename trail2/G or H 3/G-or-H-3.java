import java.util.*;
import java.io.*;

public class Main {
    public static int n, k, answer;
    public static int[] arr = new int[10001];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            int pos = Integer.parseInt(st.nextToken());
            char num = st.nextToken().charAt(0);

            if(num == 'G'){
                arr[pos] = 1;
            }
            else if(num == 'H'){
                arr[pos] = 2;
            }
        }

        for(int i = 0; i <= 10000 - k; i++){
            int temp = 0;

            for(int j = 0; j <= k; j++){
                temp += arr[i + j];
            }
            answer = Math.max(answer, temp);
        }

        System.out.println(answer);


    }
}