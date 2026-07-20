import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int x = Integer.parseInt(br.readLine());
            if (x < 25){
                System.out.println("Higher");
            }
            else if (x > 25){
                System.out.println("Lower");
            }
            else {
                System.out.println("Good");
                break;
            }
        }
    }
}