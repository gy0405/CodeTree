import java.util.*;
import java.io.*;

public class Main {
    public static int n, cnt;
    public static int[] cows;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        cows = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            cows[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(cows[i] <= cows[j] && cows[j] <= cows[k]){
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}