import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            if(arr[i] % 2 == 0){
                cnt++;
            }
        }

        int[] evenArr = new int[cnt];
        int idx = 0;

        for(int i = 0; i< N; i++){
            if (arr[i] % 2 == 0){
                evenArr[idx] = arr[i];
                idx++;
            }
        }
        for (int num : evenArr){
            System.out.print(num + " ");
        }
    }
}