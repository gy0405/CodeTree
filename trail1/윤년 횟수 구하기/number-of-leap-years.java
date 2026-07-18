import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i < n+1; i++){
            if (i % 4 == 0){
                if (i % 100 == 0 && i % 400 != 0){
                    
                }
                else
                    cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}