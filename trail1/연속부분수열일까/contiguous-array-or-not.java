import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //수열 a의 개수 N1, 수열 b의 개수 N2
        int[] N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //수열 a, 수열 b
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean x = false;

        for (int i = 0; i < N[0] - N[1] + 1; i++){
            boolean y = true;
            for (int j = 0; j < N[1]; j++){ //부분수열 일치 확인
                if (a[i+j] != b[j]){
                    y = false;
                    break;
                }
            
            }
            if (y){
                x = true;
                break;
            }
        }


        if(x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}