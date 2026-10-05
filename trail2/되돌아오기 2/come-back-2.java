import java.util.*;
import java.io.*;


public class Main {
    public static int answer, time;
    public static int ver, hor, dir;
    public static char[] dirNum = {0, 1, 2, 3}; //'N', 'E', 'S', 'W'

    public static void move(){
        if(dir == 0) {ver++;}
        else if(dir == 1) {hor++;}
        else if(dir == 2) {ver--;}
        else if(dir == 3) {hor--;}
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String order = st.nextToken();
        dir = 0; //북쪽을 바라보고 있음
        answer = -1;

        for(int i = 0; i < order.length(); i++){
            time++;

            char od = order.charAt(i);

            if(od == 'F'){
                move();
            }
            else if(od == 'R'){
                dir = (dir + 1) % 4;
            }
            else if(od == 'L'){
                dir = (dir + 3) % 4;
            }

            if(ver == 0 && hor == 0){
                answer = time;
                break;
            }
        }

        System.out.println(answer);
    }
}