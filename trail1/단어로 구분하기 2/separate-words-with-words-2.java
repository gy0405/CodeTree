import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < 10; i += 2){
            System.out.println(arr[i]);
        }
    }
}