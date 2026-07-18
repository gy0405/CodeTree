import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);

        for (int i = N; i < 101; i++){
            if (i >= 90){
                System.out.print("A ");
            }
            else if (i >= 80){
                System.out.print("B ");
            }
            else if (i >= 70){
                System.out.print("C ");
            }
            else if (i >= 60){
                System.out.print("D ");
            }
            else
                System.out.print("F ");
        }
    }
}