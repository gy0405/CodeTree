import java.util.Scanner;
  
public class Main {
    public static final int MAX_NUM = 100;

    public static int n, m;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static int happy = 0;

    public static void rowHappy(int row){
        int currHappy = 1;
        int maxHappy = 1;

        for(int i = 1; i < n; i++){
            if(grid[row][i] != grid[row][i-1]){
                currHappy = 1;
            }
            else{
                currHappy++;
            }
            maxHappy = Math.max(maxHappy, currHappy);
        }

        if(maxHappy >= m) happy++;
    }

    public static void colHappy(int col){
        int currHappy = 1;
        int maxHappy = 1;

        for(int i = 1; i < n; i++){
            if(grid[i][col] != grid[i-1][col]){
                currHappy = 1;
            }
            else{
                currHappy++;
            }

            maxHappy = Math.max(maxHappy, currHappy);
        }

        if(maxHappy >= m) happy++;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            rowHappy(i);
            colHappy(i);
        }

        System.out.println(happy);
        
    }
}