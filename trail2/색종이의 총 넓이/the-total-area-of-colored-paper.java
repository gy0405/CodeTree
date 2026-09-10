import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        //좌표평면 210 크기, 오프셋 105;

        int[][] area = new int[210][210];
        int offset = 105;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int a = x; a < x + 8; a++){
                for(int b = y; b < y + 8; b++){
                    area[a + offset][b + offset] = 1;
                }
            }
        }

        int answer = 0; //넓이 합

        for(int i = 0; i < area.length; i++){
            for(int j = 0; j < area[i].length; j++){
                if (area[i][j] == 1){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}