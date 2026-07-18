import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int a = Integer.parseInt(line[1]);

        int i = 1;

        while(i < N+1) {
            if (i % a == 0) {
                System.out.println(1);
            }
            else
                System.out.println(0);
            i++;
        }

    }
}