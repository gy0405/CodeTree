import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cnt = new int[4];

        for (int i = 0; i < 3; i++){
            String[] arr = br.readLine().split(" ");
            String state = arr[0];
            int temp = Integer.parseInt(arr[1]);

            if (state.equals("Y")){
                if (temp >= 37){
                    cnt[0]++;
                }
                else{
                    cnt[2]++;
                }
            }
            else{
                if(temp >= 37){
                    cnt[1]++;
                }
                else
                    cnt[3]++;
            }
        }

        for (int num : cnt){
            System.out.print(num + " ");
        }
        if (cnt[0] > 1){
            System.out.print("E");
        }
    }
}