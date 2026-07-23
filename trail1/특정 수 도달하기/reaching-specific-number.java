import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int sum = 0;
        int num = 0;

        for (int i = 0; i < 10; i++){
            int x = Integer.parseInt(lines[i]);
            if (x >= 250){
                break;
            }
            sum += x;
            num++;
        }
        System.out.printf("%d %.1f", sum, sum/(double)num);
    }
}