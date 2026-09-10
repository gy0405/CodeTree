import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] x1;
    public static int[] y1;
    public static int[] x2;
    public static int[] y2;

    public static int[][] area = new int[210][210];
    public static int offset = 105;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        x1 = new int[n];
        x2 = new int[n];
        y1 = new int[n];
        y2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken());
            y1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
            y2[i] = Integer.parseInt(st.nextToken());
        }
        //짝수 R (1), 홀수 B(-1)
        //전체 구역 200

        boolean isRed = true;

        for(int a = 0; a < n; a++){
            for(int i = x1[a]; i < x2[a]; i++){
                for(int j = y1[a]; j < y2[a]; j++){
                    if (a % 2 == 0){
                        area[i + offset][j + offset] = 1;
                    }
                    else{
                        area[i + offset][j + offset] = -1;
                    }
                }
            }
        }

        int answer = 0;

        for(int i = 0; i < area.length; i++){
            for(int j = 0; j < area[i].length; j++){
                if (area[i][j] == -1){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
