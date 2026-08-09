import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char N = br.readLine().charAt(0);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        boolean istrue = true;

        for(int i = 0; i < 6; i++){
            if (N == arr[i]){
                System.out.print(i);
                istrue = false;
            }
        }

        if (istrue){
            System.out.print("None");
        }
    }
}