import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] arr = new int[10];
        arr[0] = input[0];
        arr[1] = input[1];

        for(int i = 0; i < 10; i++){
            if(i < 2){
                System.out.print(arr[i] + " ");
            }
            else {
                System.out.print((arr[i-1] + arr[i-2]) % 10 + " ");
                arr[i] = (arr[i-1] + arr[i-2]) % 10;
            }
        }
         
        
    }
}