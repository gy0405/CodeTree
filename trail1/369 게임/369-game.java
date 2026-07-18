import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int N = Integer.parseInt(lines[0]);
        int i = 1;
        while (i < N+1){
            if (i % 3 == 0 || i % 6 == 0 || i % 9 == 0) {
                System.out.print(0 + " ");
            }
            else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
                System.out.print(0 + " ");
            }
            else if ((i/10) % 10 == 3 ||(i/10) % 10 == 6 || (i/10) % 10 == 9){
                System.out.print(0 + " ");
            }
            else
                System.out.print(i + " ");
            
            i++;
        }
    }
}