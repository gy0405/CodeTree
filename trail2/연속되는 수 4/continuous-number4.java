import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int max = 0;
        int cnt = 1;

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                continue;
            }
            else if (arr[i] > arr[i-1]){
                cnt++;
            }
            else{
                if (max < cnt){
                    max = cnt;
                }
                cnt = 1;
            }
        }

        if (max < cnt){
            max = cnt;
        }

        System.out.print(max);
    }
}