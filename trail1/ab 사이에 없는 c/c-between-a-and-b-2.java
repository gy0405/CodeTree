import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int a = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[1]);
        int c = Integer.parseInt(lines[2]);

        boolean x = false;

        for (; a < b + 1 ; a++){
            if (a % c == 0){
                x = true;
                break;
            }
        }

        if (x){
            System.out.println("NO");
        }
        else
            System.out.println("YES");
    }
}