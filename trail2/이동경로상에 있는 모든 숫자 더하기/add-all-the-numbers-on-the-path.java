import java.util.*;
import java.io.*;

public class Main {
    public static int n, t, x, y, answer, dir;
    public static int[][] grid;
    public static String str;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void move(){
        //스트링 읽고 그에 맞춰서 방향을 바꾸거나, 움직이는 함수 
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'R'){
                dir = (dir + 1) % 4;
            }
            else if(str.charAt(i) == 'L'){
                dir = (dir - 1 + 4) % 4;
            }
            else if(str.charAt(i) == 'F'){
                int tempx = x + dx[dir];
                int tempy = y + dy[dir];

                if(inRange(tempx, tempy)){
                    answer += grid[tempy][tempx];
                    x = tempx;
                    y = tempy;
                    //System.out.println(grid[y][x] + " " + answer);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        grid = new int[n][n];

        st = new StringTokenizer(br.readLine());
        str = st.nextToken();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < n; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        x = n / 2; y = n / 2;

        answer = grid[y][x];
        //System.out.println(grid[y][x] + " " + answer);

        dir = 0;
        move();

        System.out.print(answer);

        
    }
}