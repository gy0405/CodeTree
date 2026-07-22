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
        boolean x = false;

        for (int i = a; i < b + 1; i++){
            if (1920 % i == 0 && 2880 % i == 0){
                x = true;
                break;
            }
        }

        if (x){
            System.out.print(1);
        }
        else
            System.out.print(0);
    }
}