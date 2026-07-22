import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean x = true;

        for (int i = 2; i < N; i++){
            if (N % i == 0){
                x = false;
                break;
            }
        }

        if (x){
            System.out.println("P");
        }
        else
            System.out.println("C");
    }
}