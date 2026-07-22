import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");

        int N = Integer.parseInt(lines[0]);
        int M = Integer.parseInt(lines[1]);

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}