import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxVal = arr[0];

        for (int num : arr){
            if (num > maxVal){
                maxVal = num;
            }
        }

        System.out.println(maxVal);

    }
}