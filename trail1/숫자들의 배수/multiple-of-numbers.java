import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];


        arr[0] = Integer.parseInt(br.readLine());
        int cnt = 0;
        if (arr[0] % 5 == 0){
            cnt++;
        }

        System.out.print(arr[0] + " ");


        for (int i = 1; i < 10; i++){
            if (cnt == 2){
                break;
            }
            arr[i] = arr[0] * (i+1);
            System.out.print(arr[i] + " ");
            if (arr[i] % 5 == 0){
                cnt++;
            }
        }
    }
}