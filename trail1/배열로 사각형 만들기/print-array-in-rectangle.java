import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        int[][] arr = new int[5][5];

        //첫번째 행, 열 초기화
        
        for (int i = 0; i < 5; i++){
            arr[0][i] = 1;
            arr[i][0] = 1;
        }

        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}