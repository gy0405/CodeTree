import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        int sum = 0;
        int a = 0;

        for (int i = 0; i < N; i++){
            arr[i] = br.readLine();
            sum += arr[i].length();
            if (arr[i].charAt(0) == 'a'){
                a++;
            }
        }

        System.out.printf("%d %d", sum, a);
    }
}