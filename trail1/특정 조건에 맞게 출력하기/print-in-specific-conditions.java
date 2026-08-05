import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int num : arr){
            if (num == 0){
                break;
            }
            else if (num % 2 == 1){
                System.out.print(num + 3 + " ");
            }
            else {
                System.out.print(num / 2 + " ");
            }
        }

    }
}