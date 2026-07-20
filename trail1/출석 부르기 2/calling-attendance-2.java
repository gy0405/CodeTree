import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int x = Integer.parseInt(br.readLine());
            if (x == 1){
                System.out.println("John");
            }
            else if (x == 2){
                System.out.println("Tom");
            }
            else if (x == 3){
                System.out.println("Paul");
            }
            else if (x == 4) {
                System.out.println("Sam");
            }
            else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}