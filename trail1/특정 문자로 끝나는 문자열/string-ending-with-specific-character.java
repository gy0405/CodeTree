import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];
        boolean notIn = true;

        for (int i = 0; i < 10; i++){
            arr[i] = br.readLine();
        }

        char c = br.readLine().charAt(0);

        for (String s : arr){
            if (s.charAt(s.length() - 1) == c){
                System.out.println(s);
                notIn = false;
            }
        }

        if (notIn){
            System.out.println("None");
        }
    }
}