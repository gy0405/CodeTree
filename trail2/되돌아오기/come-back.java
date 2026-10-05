import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int ver, hor, temp; //세로, 가로 = 0이면 원점
    public static int time = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        loop:
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            char dir = st.nextToken().charAt(0);
            int len = Integer.parseInt(st.nextToken());

            while(len-- > 0){
                temp++;

                if(dir == 'N'){ver++;}
                else if(dir == 'S') {ver--;}
                else if(dir == 'E') {hor++;}
                else if(dir == 'W') {hor--;}

                if(hor == 0 && ver == 0){
                    time = temp;
                    break loop;
                }
            }
        }

        System.out.println(time);
    }
}