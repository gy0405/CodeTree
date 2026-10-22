import java.util.*;
import java.io.*;

public class Main {
    public static int n, answer;
    public static int[][] points;

    public static int length(int a, int b){
        return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[a][1] - points[b][1]);
    }

    public static int distance(int jump){
        //해당 포인트를 뛰어넘을 때의 디스탠스를 알려주는 함수
        int dist = 0;

        for(int i = 0; i < n - 1; i++){
            if((i + 1) == jump){
                dist += length(i, i+2);
                i++;
                continue;
            }
            dist += length(i, i+1);
        }

        return dist;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        answer = Integer.MAX_VALUE;

        points = new int[n][2];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < n - 1; i++){
            //System.out.println("시작");
            int temp = distance(i);
            //System.out.println(temp);
            answer = Math.min(answer, temp);
        }

        System.out.println(answer);
    }
}