import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean a = false;

        for (int i = 2; i < N; i++){
            if (N % i == 0){
                a = true;
                break;
            }
        }

        if (a){
            System.out.println('C');
        }
        else
            System.out.println('N');
    }
}