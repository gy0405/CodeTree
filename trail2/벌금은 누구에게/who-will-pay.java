import java.util.*;
import java.io.*;

public class Main {
    public static int n, m, k;
    public static int[] student;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        boolean clean = true;

        student = new int[n+1]; //1부터 n번까지

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int numS = Integer.parseInt(st.nextToken());

            student[numS]++;

            if(student[numS] == k){
                System.out.println(numS);
                clean = false;
                break;
            }
        }

        if(clean){
            System.out.println(-1);
        }
        
    }
}