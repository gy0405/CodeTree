import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int a = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[1]);

        int sum = 0;
        int num = 0;

        for (int i = a; i < b+1; i++){
            if (i % 5 == 0 || i % 7 == 0){
                sum += i;
                num++;
            }
        }

        System.out.printf("%d %.1f", sum, sum/(double) num);
    }
}