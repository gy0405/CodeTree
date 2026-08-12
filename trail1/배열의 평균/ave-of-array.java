import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = 2;
        int cols = 4;
        int[][] arr = new int[rows][cols];
        int answer = 0;

        //2차원 배열 입력 받기
        for (int i = 0; i < rows; i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        //가로 평균 = rows의 평균
        for (int i = 0; i < rows; i++){
            int sum = 0;
            for (int j = 0; j < cols; j++){
                sum += arr[i][j];
                answer += arr[i][j];
            }
            System.out.printf("%.1f ", sum / (double) cols);
        }

        System.out.println();

        //세로 평균 = cols의 평균 (rows로 나누기)

        for (int j = 0; j < cols; j++){
            int sum = 0;
            for (int i = 0; i < rows; i++){
                sum += arr[i][j];
            }
            
            System.out.printf("%.1f ", sum / (double) rows);

        }
        
        System.out.println();

        // 전체 평균
        System.out.printf("%.1f ", answer / (double) (rows*cols));

    }
}