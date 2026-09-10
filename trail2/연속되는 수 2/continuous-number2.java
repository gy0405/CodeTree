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

        int max = 1;
        int cnt = 1;

        //달라지지 않으면 맥스 갱신이 안되네..

        for (int i = 0; i < arr.length; i++){
            if(i == 0){
                continue;
            }
            else if(arr[i] == arr[i - 1]){
                cnt++;
            }
            else if (arr[i] != arr[i - 1]) {
                if(max < cnt){
                    max = cnt;
                }
                cnt = 1;
            }
        }

        if(max < cnt){
            max = cnt;
        }

        System.out.println(max);
    }
}