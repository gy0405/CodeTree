import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            sum += x;

        }

        System.out.printf("%d %.1f", sum, sum / (double)N);
    }
}