import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");

        int N = Integer.parseInt(lines[0]);

        for (int i = 1; i < N + 1; i++){
            if (i % 2 == 0 || i % 3 == 0){
                System.out.print(1 + " ");
            }
            else
                System.out.print(0 + " ");
        }
    }
}