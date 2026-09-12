import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        // Please write your code here.

        int[] monthNum = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int total = 0;

        while(true){
            if(m1 == m2 && d1 == d2){
                total++;
                break;
            }

            total++;
            d1++;

            if(d1 > monthNum[m1]){
                m1++;
                d1 = 1;
            }
        }

        int offset = 0;

        for(int i = 0; i < 7; i++){
            if(days[i].equals(A)){
                offset = i;
            }
        }

        if (offset >= total){
            System.out.println(0);
        }
        else {
            System.out.println((total - 1 - offset) / 7 + 1);
        }
    }
}