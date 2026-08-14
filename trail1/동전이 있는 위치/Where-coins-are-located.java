import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nm[0];
        int m = nm[1];
        int[][] arr = new int[n][n];

        for(int i = 0; i < m; i++){
            int[] coin = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            coin[0] -= 1;
            coin[1] -= 1;

            arr[coin[0]][coin[1]] = 1;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}