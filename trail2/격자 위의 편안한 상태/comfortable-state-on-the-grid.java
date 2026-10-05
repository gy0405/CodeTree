import java.util.*;
import java.io.*;

public class Main {
    public static int n, m, answer;
    public static int[][] grid;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static boolean inRange(int x, int y){
        return 0 < x && x <= n && 0 < y && y <= n;
    }

    public static boolean isComfy(int x, int y){
        int comfy = 0;

        for(int i = 0; i < 4; i++){
            int tempX = x + dx[i];
            int tempY = y + dy[i];

            if(inRange(tempX, tempY) && grid[tempX][tempY] == 1){
                comfy++;
            }
        }

        if(comfy == 3){return true;}
        else {return false;}

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        grid = new int[n + 1][n + 1];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            grid[x][y] = 1;

            answer = (isComfy(x, y)) ? 1 : 0;
            System.out.println(answer);
            
        }
        
    }
}