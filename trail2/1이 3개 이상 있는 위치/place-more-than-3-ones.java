import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[][] arr;

    public static boolean inRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        int ans = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int cnt = 0;
                for(int num = 0; num < 4; num++){
                    int nx = i + dx[num], ny = j + dy[num];
                    if(inRange(nx, ny) && arr[nx][ny] == 1){
                        cnt++;
                    }
                }
                if(cnt >= 3){
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }
}