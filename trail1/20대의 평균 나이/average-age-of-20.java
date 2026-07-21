import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = 0;

        while(true){
            int x = Integer.parseInt(br.readLine());

            if (x < 20 || x > 29){
                break;
            }

            sum += x;
            num ++;
        }
        System.out.printf("%.2f", sum/(double)num);

    }
}