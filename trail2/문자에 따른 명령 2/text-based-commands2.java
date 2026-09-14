import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        //북 동 남 서
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int nx = 0;
        int ny = 0;

        int direction = 0; //왼쪽 전환 시 -1, 오른쪽 전환시 +1 후 보정까지

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                direction = ((direction - 1) + 4) % 4;
            }
            else if(s.charAt(i) == 'F'){
                nx += dx[direction];
                ny += dy[direction];
            }
            else if(s.charAt(i) == 'R'){
                direction = ((direction + 1) + 4) % 4;
            }
        }

        System.out.println(nx + " " + ny);
    }
}