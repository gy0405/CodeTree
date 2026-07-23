import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        Double sum = 0.0;

        for (int i = 0; i < 8; i++){
            Double x = Double.parseDouble(lines[i]);
            sum += x;
        }
        System.out.printf("%.1f", sum / 8);
    }
}