import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int A = Integer.parseInt(lines[0]);
        int B = Integer.parseInt(lines[1]);

        int prod = 1;

        for (; A < B+1; A++){
            prod *= A;
        }

        System.out.println(prod);
    }
}