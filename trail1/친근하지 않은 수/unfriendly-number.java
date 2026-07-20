import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 1; i < n+1; i++){
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                sum++;
            }
        }

        System.out.println(n-sum);
    }
}