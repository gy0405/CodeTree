import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int num = 0;

        int[][] arr = new int[N][M];

        for (int j = 0; j < M; j++){
            if (j % 2 == 0){
                for (int i = 0; i < N; i++){
                    arr[i][j] = num;
                    num++;
                }
            }
            else {
                for (int i = N - 1; i > -1; i--){
                    arr[i][j] = num;
                    num++;
                }
            }
            
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}