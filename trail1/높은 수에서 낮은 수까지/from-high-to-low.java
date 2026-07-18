import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);

        if (A >= B){
            while (A >= B){
                System.out.print(A + " ");
                A--;
            }
        }
        else {
            while (A <= B){
                System.out.print(B + " ");
                B--;
            }
        }
    }
}