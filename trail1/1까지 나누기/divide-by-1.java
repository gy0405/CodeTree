import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int i = 1;
        int sum = 0;

        while (N > 1){
            N = N / i;
            i++;
            sum++;
        }
        System.out.println(sum);
    }
}