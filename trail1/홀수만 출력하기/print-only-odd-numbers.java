import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            if (num % 2 == 1 && num % 3 == 0){
                System.out.println(num);
            }
        }
    }
}