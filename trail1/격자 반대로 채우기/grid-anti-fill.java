import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        boolean reverse = true;
        int num = 1;

        for(int j = N - 1; j >= 0; j--){
            if (reverse){
                for(int i = N-1; i >= 0; i--){
                    arr[i][j] = num;
                    num++;
                    reverse = false;
                }
            }
            else {
                for(int i = 0; i < N; i++){
                    arr[i][j] = num;
                    num++;
                    reverse = true;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for (int ans : arr[i]){
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}