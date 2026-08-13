import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 3
        int M = sc.nextInt(); // 6
        int[][] arr = new int[N][M];
        int num = 1;

        //첫번째 행 채워넣기. 행은 0, 줄은 i
        for (int i = 0; i < M; i++){
            int currRow = 0;
            int currCol = i;

            while (currCol >= 0 && currRow < N){
                arr[currRow][currCol] = num;

                num++;
                currRow++;
                currCol--;
            }
        }

        //열 채워넣기
        for (int i = 1; i < N; i++){
            int currRow = i;
            int currCol = M - 1;

            while(currCol >= 0 && currRow < N){
                arr[currRow][currCol] = num;

                num++;
                currRow++;
                currCol--;
            }
        }

        for(int row = 0; row < N; row++) {
            for(int col = 0; col < M; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }
    }
}