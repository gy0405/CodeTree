import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(true){
            if (N == 1) break;

            if (N % 2 == 0){
                N = N / 2;
                cnt++;
                if (N == 1)
                    break;
            }
            else{
                N = N * 3 + 1;
                cnt++;
                if (N == 1)
                    break;
            }     
        }

        System.out.println(cnt);
       
    }
}