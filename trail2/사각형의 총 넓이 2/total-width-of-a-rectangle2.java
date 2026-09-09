import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        //합집함의 넓이 = 그냥 전체 하고 0이 아닌 부분을 세자
        //각 부분 210 크기로 잡기

        int[][] square = new int[210][210];
        int offset = 105;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int a = x1; a < x2; a++){
                for (int b = y1; b < y2; b++){
                    square[a + offset][b + offset]++;
                }
            }
        }

        int answer = 0; //넓이

        for(int i = 0; i < square.length; i++){
            for(int j = 0; j < square[i].length; j++){
                if (square[i][j] > 0){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}