import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //2*i + 1
        for (int i = 0; i < N; i++){
            for (int j = 0; j < i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}