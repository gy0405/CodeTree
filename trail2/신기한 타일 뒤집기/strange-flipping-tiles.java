import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        //왼쪽 L 흰색 (1), 오른쪽 R 검은색 (-1)
        //한쪽 길이 100000 > 전체 길이 200010, 포인터 100005

        int[] line = new int[200010];
        int pointer = 100005;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);

            if(direction == 'L') {
                for(int j = 0; j < x; j++){
                    line[pointer--] = 1;
                }
                pointer++;
            }
            else if(direction == 'R'){
                for(int j = 0; j < x; j++){
                    line[pointer++] = -1;
                }
                pointer--;
            }
        }

        int white = 0; // 1을 세야함
        int black = 0; // -1을 세야함

        for(int i : line){
            if (i == 1){
                white++;
            }
            else if (i == -1){
                black++;
            }
        }

        System.out.println(white + " " + black);
        
    }
}