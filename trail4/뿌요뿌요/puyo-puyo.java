import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 100;

    public static int n, blockCnt, blockValue;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static boolean CanGo(int x, int y){
        if(!inRange(x, y)){
            return false;
        }
        if(visited[x][y] == true || grid[x][y] != blockValue){
            return false;
        }
        return true;
    }

    public static void DFS(int x, int y){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(CanGo(newX, newY)){
                visited[newX][newY] = true;
                blockCnt++;
                DFS(newX, newY);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int ans = 0, max = 0;

        for(int a = 0; a < n; a++){
            for(int b = 0; b < n; b++){
                if(!visited[a][b]){
                    blockValue = grid[a][b];

                    visited[a][b] = true;
                    blockCnt = 1;
                    DFS(a, b);

                    if(blockCnt >= 4) ans++;
                    max = Math.max(max, blockCnt);
                }
            }
        }
        

        System.out.println(ans + " " + max);

    }
}