import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] answer = new int[10];
        answer[0] = nums[0];
        answer[1] = nums[1];

        for (int i = 2; i < 10; i++){
            answer[i] = answer[i-1] + 2 * answer[i-2];
        }

        for (int num : answer){
            System.out.print(num + " ");
        }

    }
}