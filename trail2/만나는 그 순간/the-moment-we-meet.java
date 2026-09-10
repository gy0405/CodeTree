import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_T = 1000000;

    public static int n, m;
    public static int[] posA = new int[MAX_T + 1];
    public static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int timeA = 1; //pos A의 index
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            while(t-- > 0){ //시간이 0보다 클때 (줄이는건 나중에)
                if(d == 'R'){
                    posA[timeA] = posA[timeA - 1] + 1;
                }
                else
                    posA[timeA] = posA[timeA - 1] - 1;
                
                timeA++;
            }
        }

        int timeB = 1; 
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            while(t-- > 0){ //시간이 0보다 클때 (줄이는건 나중에)
                if(d == 'R'){
                    posB[timeB] = posB[timeB - 1] + 1;
                }
                else
                    posB[timeB] = posB[timeB - 1] - 1;
                
                timeB++;
            }
        }

        int ans = -1;
        for(int i = 1; i < timeA; i++){
            if(posA[i] == posB[i]){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}