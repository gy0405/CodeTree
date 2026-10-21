import java.util.*;
import java.io.*;

public class Main {
    public static int two2ten(char[] arr){
        int answer = 0;

        for(int i = 0; i < arr.length; i++){
            int temp = arr[i] - '0';
            answer *= 2;
            answer += temp;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] arr = st.nextToken().toCharArray();
        boolean all_1 = true;

        //전체 중에 0이 끼어있을 때 > 가장 앞의 0을 1로 바꾼다.

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '0'){
                arr[i] = '1';
                all_1 = false;
                break;
            }
        }

        //전부 1111일때 > 가장 마지막 수를 0으로 바꾼다.
        if(all_1){
            arr[arr.length - 1] = '0';
        }

        //System.out.println(arr);

        System.out.println(two2ten(arr));
    }
}