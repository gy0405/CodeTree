import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int two = 0;
        int three = 0;
        int twlv = 0;

        for (int i = 1; i < n+1; i++){
            if (i % 12 == 0){
                twlv++;
            }
            else if (i % 3 == 0){
                three++;
            }
            else if (i % 2 == 0){
                two++;
            }
        }

        System.out.println(two + " " + three + " " + twlv);
    }
}