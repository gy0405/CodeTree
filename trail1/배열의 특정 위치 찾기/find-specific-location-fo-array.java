import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");

        int first = 0;
        int second = 0;
        
        for (int i = 0; i < 10; i++){
            if (i % 2 == 1){
                first += Integer.parseInt(lines[i]);
            }
            if (i == 2 | i == 5 | i == 8){
                second += Integer.parseInt(lines[i]);
            }
        }

        System.out.printf("%d %.1f", first, second / (double) 3.0);
    }
}