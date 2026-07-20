import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n+1; i++){
            if (i % 2 == 1 && i % 10 != 5){
                if (i % 3 == 0 && i % 9 != 0){
                    continue;
                }
                System.out.print(i + " ");
            }
        }

        
    }
}