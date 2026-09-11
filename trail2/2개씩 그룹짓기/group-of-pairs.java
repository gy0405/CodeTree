import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] nums = new int[2 * n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 2 * n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        int tmp = 0;
        int ans = 0;

        for(int i = 0; i < n; i++){ // 0, 1
            tmp = nums[i] + nums[nums.length - 1 - i];
            if (ans < tmp){
                ans = tmp;
            }
        }

        System.out.println(ans);
    }
}