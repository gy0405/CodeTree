import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[][] grid;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static int go, cnt, idx, dir;
    public static int x, y;

    public static void answer(){
        while(idx <= n * n){ 
        
            for(int i = 0; i < go && idx <= n*n; i++){
                x += dx[dir];
                y += dy[dir];
                grid[y][x] = idx++;
            }

            dir = (dir + 1) % 4;
            cnt++;

            if (cnt == 2){
                go++;
                cnt = 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        grid = new int[n][n];

        int sp = n / 2; //grid[sp][sp] = 1 에서 시작

        x = y = sp;

        grid[sp][sp] = 1;

        go = 1;
        cnt = 0;
        idx = 2;

        answer();

        //1, 1, 2, 2, 3, 3, 4, 4 
        //go 값만큼 앞으로 이동, cnt 값이 2가 되면 go 값을 하나 올리고 cnt를 내림

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}