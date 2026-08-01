import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int odd = 0;
        int even = 0;

        for (int i = 0; i < 10; i++){
            if (i % 2 == 0){
                odd += arr[i];
            }
            else
                even += arr[i];
        }

        if (odd > even){
            System.out.println(odd - even);
        }
        else
            System.out.println(even - odd);
    }
}