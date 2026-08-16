import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = "";

        for (int i = 0; i < n; i++){
            str += br.readLine();
        }

        System.out.println(str);
    }
}