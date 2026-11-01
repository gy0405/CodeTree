import java.util.*;
import java.io.*;

public class Main {
    public static int n, answer;
    public static int[] arr;

    public static boolean avgIn(int s, int e){
        int num = e - s + 1;
        int sum = 0;

        for(int i = s; i <= e; i++){
            sum += arr[i];
        }

        double avg = sum / (double) num;

        for(int i = s; i <= e; i++){
            if(avg == (double) arr[i]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        answer += n;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(avgIn(i, j)){ //평균값이 그 구간의 원소와 같다면 (i는 시작점, j는 끝 점)
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}