import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean x = true;
       
        for (int i = 0; i < 5; i++){
            int n = Integer.parseInt(br.readLine());
            if (n % 3 != 0){
                x = false;
                break;
            }
        }

        if(x){
            System.out.println(1);
        }
        else
            System.out.println(0);
    }
}