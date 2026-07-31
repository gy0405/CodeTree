import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] lines = br.readLine().split(" ");

        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(lines[N-1-i]);
            if (x % 2 == 0){
                System.out.print(x + " ");
            }
        }
    }
}