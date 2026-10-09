import java.util.*;
import java.io.*;

public class Main {
    public static int n, temp, max;
    public static int[][] grid;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        grid = new int[n][n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n - 3; j++){
                for(int k = j; k <= j + 2; k++){
                    if(grid[i][k] == 1){
                        temp++;
                    }
                }

                max = Math.max(max, temp);
                temp = 0;

            }
        }

        System.out.println(max);
        
    }
}