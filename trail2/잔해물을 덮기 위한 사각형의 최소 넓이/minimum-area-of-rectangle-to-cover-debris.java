import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ax1 = Integer.parseInt(st.nextToken());
        int ay1 = Integer.parseInt(st.nextToken());
        int ax2 = Integer.parseInt(st.nextToken());
        int ay2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int bx1 = Integer.parseInt(st.nextToken());
        int by1 = Integer.parseInt(st.nextToken());
        int bx2 = Integer.parseInt(st.nextToken());
        int by2 = Integer.parseInt(st.nextToken());

        //좌표평면 크기 2010, 오프셋 1005
        //a 사각형(1)  b 사각형(-1) 
        //1인 구간 중에서 가장 좌표 작은 x1, y1 + x2, y2 구해야함

        int[][] area = new int[2010][2010];
        int offset = 1005;

        for(int i = ax1; i < ax2; i++){
            for(int j = ay1; j < ay2; j++){
                area[i + offset][j + offset] = 1;
            }
        }

        for(int i = bx1; i < bx2; i++){
            for(int j = by1; j < by2; j++){
                area[i + offset][j + offset] = area[i + offset][j + offset] - 1;
            }
        }

        int x1 = 2005;
        int y1 = 2005;
        int x2 = 0;
        int y2 = 0;

        for(int i = 0; i < area.length; i++){
            for(int j = 0; j < area[i].length; j++){
                if(area[i][j] == 1){
                    if(i < x1){
                        x1 = i;
                    }
                    if(j < y1){
                        y1 = j;
                    }
                    if(x2 < i){
                        x2 = i;
                    }
                    if(y2 < j){
                        y2 = j;
                    }
                }
            }
        }

        //잔해물이 남지 않았을 경우 생각

        if (x2 == 0 && y2 == 0){
            System.out.println(0);
        }
        else {
            int answer = (x2 + 1 - x1) * (y2 + 1 - y1);
            System.out.println(answer);
        }

    }
}