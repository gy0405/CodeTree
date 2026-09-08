import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] line = new int[2002]; // 1000이 0, -1001~1001까지 있음
        int pointer = 1000; //0

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char y = st.nextToken().charAt(0);

            if (y == 'L'){
                //시작 포인터 색칠 안됨, 끝 포인터 색칠됨
                for(int j = 0; j < x; j++){
                    pointer--;
                    line[pointer]++;
                }
            }
            else if (y == 'R'){
                for(int j = 0; j < x; j++){
                    line[pointer]++;
                    pointer++;
                }
            }
        }

        int cnt = 0;

        for(int i : line){
            if(i > 1){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}