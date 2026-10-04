import java.util.*;
import java.io.*;

public class Main {
    public static int n, m; //행, 열
    public static int[][] grid;
    public static int idx, dir;
    public static int x, y;

    public static int[] dx = {0, -1, 0, 1};
    public static int[] dy = {1, 0 ,-1, 0}; //오른쪽, 아래, 왼쪽, 위쪽

    public static boolean canGo(int row, int col){
        return 0 <= row && row < n && 0 <= col && col < m;
    }

    public static void moveOrChange(){
        //우선 임시 위치를 설정함
        int tempX = x + dx[dir];
        int tempY = y + dy[dir];

        //방향 바꾸기 = 갈 수 없는 곳에 도달했을 때 + 도달한 곳이 이미 방문한 곳일 때(0이 아닐때)
        if(!canGo(tempX, tempY) || grid[tempX][tempY] != 0){
            //갈 수 없거나, 도달한 적 있는 곳이라면
            dir = (dir + 1) % 4; //방향을 바꿔라
        }
        else{
            //갈 수 있다면
            grid[tempX][tempY] = idx++; //해당 위치에 인덱스 숫자를 쓰고
            //현재 위치를 옮겨라
            x = tempX;
            y = tempY;
        }
    }

    public static void printGrid(){  
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        idx = 2;

        grid = new int[n][m];
        grid[0][0] = 1;

        while(idx <= n*m){
            moveOrChange();
        }

        printGrid();
        
    }
}