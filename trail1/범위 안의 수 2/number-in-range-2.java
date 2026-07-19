import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = 0;

        for (int i = 0; i < 10; i++){
            int n = Integer.parseInt(br.readLine());

            if (n >= 0 && n <= 200){
                sum += n;
                num++;
            }
        }

        System.out.printf("%d %.1f", sum, sum/(double)num);
    }
}