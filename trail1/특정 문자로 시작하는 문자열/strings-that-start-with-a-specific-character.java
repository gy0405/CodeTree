import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        int sum = 0;
        int num = 0;

        for (int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        char c = br.readLine().charAt(0);

        for (String s : arr){
            if (s.charAt(0) == c){
                sum += s.length();
                num++;
            }
        }

        System.out.printf("%d %.2f", num, sum / (double)num );

    }
}