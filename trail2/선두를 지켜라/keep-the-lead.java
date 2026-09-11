import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_P = 1000000;
    
    public static int n, m;
    public static int[] posA = new int[MAX_P + 1];
    public static int[] posB = new int[MAX_P + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int time_a = 1;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while(t-- > 0){
                posA[time_a] = posA[time_a - 1] + v;
                time_a++;
            }
        }

        int time_b = 1;

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while(t-- > 0){
                posB[time_b] = posB[time_b - 1] + v;
                time_b++;
            }
        }

        int winner = 0;
        int ans = -1;

        //선두가 바뀐다... 

        for(int i = 0; i < time_a; i++){
            int diff = posA[i] - posB[i];
            int curwinner;

            if(diff > 0){
                curwinner = 1;
            }
            else if (diff < 0){
                curwinner = -1;
            }
            else{
                curwinner = 0;
            }

            if (curwinner != 0 && curwinner != winner){
                ans++;
                winner = curwinner;
            }
        }

        System.out.println(ans);
    }
}