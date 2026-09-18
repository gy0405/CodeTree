import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 20;

    public static int n;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];

    public static int getCoin(int rowS, int colS, int rowE, int colE){
        int coin = 0;

        for(int row = rowS; row <= rowE; row++){
            for(int col = colS; col <= colE; col++){
                coin += grid[row][col];
            }
        }
        
        return coin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        int maxCoin = 0;

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                if(row + 2 >= n || col + 2 >= n) 
                    continue;

                int numOfCoin = getCoin(row, col, row + 2, col + 2);

                maxCoin = Math.max(maxCoin, numOfCoin);
            }
        }

        System.out.println(maxCoin);
    }
}