import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = {1, -1, 0, 0}; //동 0 서 1 남 2 북 3
    public static int[] dy = {0, 0, -1, 1};

    public static int nx = 0;
    public static int ny = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char direction = st.nextToken().charAt(0);
            int distance = Integer.parseInt(st.nextToken());
            // Please write your code here.

            if(direction == 'E'){
                nx += dx[0] * distance;
            }
            else if(direction == 'W'){
                nx += dx[1] * distance;
            }
            else if(direction == 'S') {
                ny += dy[2] * distance;
            }
            else if(direction == 'N'){
                ny += dy[3] * distance;
            }
        }

        System.out.println(nx + " " + ny);

    }
}