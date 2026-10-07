import java.util.*;
import java.io.*;

public class Main {
    public static int n, m, row, col, idx, dir;
    public static int[][] grid;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static boolean inRange(int row, int col){
        return 0 <= row && row < n && 0 <= col && col < m;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new int[n][m];

        grid[0][0] = 1;
        idx = 2;

        while(idx <= n * m){
            //현재 방향으로 다음 칸을 옮긴다
            int nextRow = row + dx[dir];
            int nextCol = col + dy[dir];

            if(inRange(nextRow, nextCol) && grid[nextRow][nextCol] == 0){
                //다음 칸이 범위 안에 있으면 그 칸에 idx를 쓰고 idx ++
                //해당 방향으로 계속해서 나아감
                row = nextRow;
                col = nextCol;
                grid[row][col] = idx++;
                //System.out.println(row + " " + col + " " +grid[row][col]);
                //System.out.println(row + " " + col);
            }
            else {
                //범위 밖에 있으면 dir를 변경 
                dir = (dir + 1) % 4;
                //System.out.println(dir);
            }

        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}