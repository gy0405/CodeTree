import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int sum = 0;
        
        for (int i = 0; i < 100; i++){
            if (lines[i].equals("0")){
                sum = Integer.parseInt(lines[i-1]) + Integer.parseInt(lines[i-2]) + Integer.parseInt(lines[i-3]);
                break;
            }
        }

        System.out.print(sum);
    }
}