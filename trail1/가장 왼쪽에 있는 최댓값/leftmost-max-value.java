import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cut = N;

        //1. 최댓값의 위치 출력
        //2. 해당 최댓값보다 앞에 있는 것들 중 최댓값
        //3. 첫번째 원소만 남으면 종료

        while(true){
            int max = arr[0];

            //1. 최댓값 찾기
            for (int i = 0; i < cut; i++){
                if (max <= arr[i]){
                    max = arr[i];
                }
            }
            //2. 최댓값 위치 찾기
            for (int i = 0; i < cut; i++){
                if (max == arr[i]){
                    cut = i;
                    break;
                }
            }

            //3. 최댓값 위치 적기
            System.out.print( (cut+1) + " ");

            if (cut == 0){
                break;
            }

        }


    }
}