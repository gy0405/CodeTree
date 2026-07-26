import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] arr = new int[10];
        int sum = 0;
        int num = 10;

        for (int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(lines[i]);
            if (arr[i] == 0){
                num = i;
                break;
            }
            sum += arr[i];
        }

        System.out.printf("%d %.1f", sum, sum/(double)num);
    }
}