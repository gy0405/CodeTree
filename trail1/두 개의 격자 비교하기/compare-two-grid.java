import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] first = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = first[0];
        int M = first[1];

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        for (int i = 0; i < N; i++){
            arr1[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        
        for (int i = 0; i < N; i++){
            arr2[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (arr1[i][j] == arr2[i][j]){
                    System.out.print(0 + " ");
                }
                else
                    System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}