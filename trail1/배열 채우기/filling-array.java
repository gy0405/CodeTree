import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int a = 10;


        for (int i = 0; i < 10; i++){
            if (lines[i].equals("0")){
                a = i;
                break;
            }
        }

        for (int i = 0; i < a; i++){
            System.out.print(lines[a-1-i] + " ");
        }
    }
}