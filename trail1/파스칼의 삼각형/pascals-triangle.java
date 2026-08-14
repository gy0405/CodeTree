import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        //첫번째 열 1로 초기화

        for (int j = 0; j < N; j++){
            arr[j][0] = 1;
        }

        //대각선 1로 초기화

        for (int i = 0; i < N; i++){
            arr[i][i] = 1;
        }

        for (int i = 1; i < N; i++){
            for (int j = 1; j <N; j++){
                arr[i][j] = arr[i-1][j-1]+ arr[i-1][j];
            }
        }


        //출력
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (arr[i][j] == 0){
                    break;
                }
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}