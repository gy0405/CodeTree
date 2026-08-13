import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++){
            int num = i + 1;

            for (int j = 0; j < N; j++){
                System.out.print(num + " ");
                num += N;
            }
            System.out.println();
        }

    }
}