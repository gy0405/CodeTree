import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] lines = br.readLine().split(" ");
        String C = lines[0];
        int N = Integer.parseInt(lines[1]);
        int i = 1;

        if (C.equals("A")) {
            while ( i < N + 1 ){
                System.out.print(i + " ");
                i++;
            }
        }
        else if (C.equals("D")) {
            while ( i < N + 1 ){
                System.out.print( (N+1-i) + " ");
                i++;
        }
        
    }
 }
}