import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        for (int i = 0; i < 10; i++){
            int x = Integer.parseInt(br.readLine());
            if (x % 2 == 1){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}