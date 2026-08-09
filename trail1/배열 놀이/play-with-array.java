import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //첫 줄 N과 Q(질의 갯수)
        int[] nq = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //두번째 줄 실제 어레이
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        //세번째부터 포문으로 돌릴거임
        for(int i = 0; i < nq[1]; i++){
            int[] q = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (q[0] == 1){
                System.out.println(arr[q[1]-1]);
            }
            else if (q[0] == 2){
                //arr에서 q[1]인 원소를 찾아 그 원소가 몇번째 원소인지 출력
                boolean bool = true;
                for(int j = 0; j < nq[0]; j++){
                    if (arr[j] == q[1]){
                        System.out.println(j+1);
                        bool = false;
                        break;
                    }
                }
                if (bool){
                    System.out.println(0);
                }
                
            }
            else if (q[0] == 3) {
                //q[1]-1, q[2]-1 까지 출력
                for(int j = q[1]-1; j < q[2]; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();               
            }
        }

    }
}