import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int prod = 1;

        for (int i = 1; i < 11; i++){
            prod *= i;

            if (prod >= N){
                System.out.println(i);
                break;
            }
        }
    }
}