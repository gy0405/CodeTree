import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;

        for (int i = 0; i < N; i++){
            int sum = 0;
            String[] lines = br.readLine().split(" ");
            for (int j = 0; j < 4; j++){
                sum += Integer.parseInt(lines[j]);
            }
            if (sum / 4.0 >= 60.0){
                System.out.println("pass");
                //System.out.println(sum / 4.0);
                num++;
            }
            else
                System.out.println("fail");
        }
        System.out.println(num);
    }
}