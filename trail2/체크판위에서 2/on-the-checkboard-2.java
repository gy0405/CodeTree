import java.util.*;
import java.io.*;

public class Main {
    public static int n, m, cnt;
    public static char[][] grid;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new char[n + 1][m + 1]; //1부터 셀거임

        for(int i = 1; i < n + 1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j < m + 1; j++){
                grid[i][j] = st.nextToken().charAt(0);
            }
        }

        //이동은 점프, 현재 != 나중
        //오른쪽 + 아래로만 점프 가능
        // 시작(1, 1) + 경유지 1 + 경유지 2 + 끝 (n, m)

        //첫번째 경유지 찾기


        for(int i = 2; i <= n - 2; i++){
            for(int j = 2; j <= m - 2; j++){

                if(grid[i][j] != grid[1][1]){
                    //grid[i][j]는 첫번째 경유지

                    for(int a = i + 1; a <= n - 1; a++){
                        for(int b = j + 1; b <= m - 1; b++){
                            
                            if(grid[a][b] != grid[i][j] && grid[a][b] != grid[n][m]){
                                cnt++;
                            }

                        }
                    }


                }
            }
        }

        System.out.println(cnt);


    }
}