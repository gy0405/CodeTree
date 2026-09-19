import java.util.Scanner;
public class Main {
    public static int n, ans;
    public static int[][] grid;
    public static boolean[] colUsed;

    public static void color(int row, int sum){
        if (row == n){
            ans = Math.max(ans, sum);
            return;
        }

        for(int i = 0; i < n; i++){
            if(!colUsed[i]){
                colUsed[i] = true;
                color(row + 1, sum + grid[row][i]);
                colUsed[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        colUsed = new boolean[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        color(0, 0);

        System.out.println(ans);
    }
}