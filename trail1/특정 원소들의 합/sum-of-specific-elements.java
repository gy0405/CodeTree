import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = 4;
        int cols = 4;
        int[][] arr = new int[rows][cols];
        int sum = 0;

        //배열 받기
        for (int i = 0; i < rows; i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        //i >= j인 것만 합하기
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}