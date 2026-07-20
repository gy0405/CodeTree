import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        while (cnt < 3){
            int x = Integer.parseInt(br.readLine());
            if (x % 2 == 1){
                continue;
            }
            else {
                System.out.println(x/2);
                cnt++;
            }
        }
    }
}