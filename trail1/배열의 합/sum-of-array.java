import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = 4;
        int cols = 4;
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < rows; i++){
            int answer = 0;
            for (int num : arr[i]){
                answer += num;
            }
            System.out.println(answer);
        }
    }
}