import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i < a+1; i++){
            if (i % 2 == 0 && i % 4 != 0){
                continue;
            }
            else if ( (i/8) % 2 == 0){
                continue;
            }
            else if ( (i%7) < 4){
                continue;
            }

            System.out.print(i + " ");
        }


    }
}