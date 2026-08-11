import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int max = -1000;
        int min = 1000;

        while(true){
            int N = sc.nextInt();
            if (N == 999 || N == -999){
                break;
            }

            if (N > max){
                max = N;
            }

            if (N < min){
                min = N;
            }
        }

        System.out.printf("%d %d", max, min);
    }
}