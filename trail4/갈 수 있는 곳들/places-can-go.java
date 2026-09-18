import java.util.*;

//0은 이동할수 있음, 1은 이동 불가

class Pair {
    int x, y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static final int MAX_NUM = 100;

    public static int n, k, ans;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];
    public static int[][] starts = new int[MAX_NUM * MAX_NUM][2];
    
    public static Queue<Pair> q = new ArrayDeque<>();

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static boolean canGo(int x, int y){
        return inRange(x, y) && grid[x][y] == 0 && !visited[x][y];
    }

    public static void BFS(){
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int x = curr.x, y = curr.y;

            int[] dx = new int[]{0, 1, 0, -1};
            int[] dy = new int[]{1, 0, -1, 0};

            for(int i = 0; i < 4; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];

                if(canGo(newX, newY)){
                    ans++;
                    q.add(new Pair(newX, newY));
                    visited[newX][newY] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

    
        for (int i = 0; i < k; i++) {
            starts[i][0] = sc.nextInt() - 1;
            starts[i][1] = sc.nextInt() - 1;
        }
        // Please write your code here.

        for (int i = 0; i < k; i++){
            int a = starts[i][0], b = starts[i][1];

            if(canGo(a, b)){
                ans++;
                q.add(new Pair(a, b));
                visited[a][b] = true;

                BFS();
            }
        }

        System.out.println(ans);
    }
}