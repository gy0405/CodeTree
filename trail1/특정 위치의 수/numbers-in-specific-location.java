import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");

        int sum = Integer.parseInt(lines[2]) + Integer.parseInt(lines[4]) + Integer.parseInt(lines[9]);
        System.out.println(sum);
    }
}