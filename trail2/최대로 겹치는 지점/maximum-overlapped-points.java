import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] line = new int[101];

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            //start 부터 end -1까지 색칠 (start > end)

            for (int j = start; j < end + 1; j++){
                line[j]++;
            }
        }

        int max = 0;

        for(int i : line){
            if (max < i){
                max = i;
            }
        }

        System.out.println(max);

    }
}