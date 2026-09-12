import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_T = 4000000;
    public static int[] posA = new int[MAX_T + 1];
    public static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int timeA = 0;
        int timeB = 0;
        int idxA = 1;
        int idxB = 1;
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);
            timeA += t;

            while(t-- > 0){
                if(d == 'R'){
                    posA[idxA] = posA[idxA - 1] + 1;
                    idxA++;
                }
                else if(d == 'L'){
                    posA[idxA] = posA[idxA - 1] - 1;
                    idxA++;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);
            timeB += t;

            while(t-- >0){
                if(d == 'R'){
                    posB[idxB] = posB[idxB - 1] + 1;
                    idxB++;
                }
                else{
                    posB[idxB] = posB[idxB - 1] - 1;
                    idxB++;
                }
            }
        }

        int maxT = Math.max(idxA, idxB);

        for(int i = idxA; i < maxT; i++){
            posA[i] = posA[idxA - 1];
        }

        for(int i = idxB; i < maxT; i++){
            posB[i] = posB[idxB - 1];
        }


        // for(int i = 0; i < 20; i++){
        //     System.out.print(posA[i] + " ");
        // }
        // System.out.println();
        // for(int i = 0; i < 20; i++){
        //     System.out.print(posB[i] + " ");
        // }

        //1초, 2초, 3초에 어디에 있었는지
        //초가 같을때 이전 초가 다르면
        //for(int i = 0; i < )

        int ans = 0;

        for(int i = 1; i < maxT; i++){
            if(posA[i] == posB[i] && posA[i-1] != posB[i-1]){
                ans++;
            }
        }
        
        System.out.println(ans);
        
        // Please write your code here.
    }
}