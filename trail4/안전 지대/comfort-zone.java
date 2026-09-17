import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 50;

    public static int n, m, k;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited;
    public static int[] knums = new int[101]; //1부터 100까지
    public static int num;

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static boolean CanGo(int x, int y){
        if(!inRange(x, y)){ //격자 내에 있을 때
            return false;
        }
        //방문한 적이 없고, 수위보다 집이 높을 때 
        if(visited[x][y] == true || grid[x][y] <= k){
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
                DFS(newX, newY);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        for(int i = 1; i < 101; i++){
            k = i; // 수위 설정
            visited = new boolean[MAX_NUM][MAX_NUM]; //방문 초기화
            num = 0;

            for(int a = 0; a < n; a++){
                for(int b = 0; b < m; b++){
                    if(CanGo(a, b)){
                        visited[a][b] = true;
                        num++;
                        DFS(a, b);
                    }
                }
            }

            knums[k] = num;
        }

        int ans = 0; // 안전영역의 수
        int idx = 1; // k 값

        for(int i = 0; i < knums.length; i++){
            if(ans < knums[i]){
                ans = knums[i];
                idx = i;
            }
        }

        System.out.println(idx + " " +ans);

    }
}