import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.

        char[] arr = N.toCharArray();
        int num = 0;

        for(int i = 0; i < arr.length; i++){
            num *= A;
            num += arr[i] - '0';
        }

        //System.out.print(num);

        int cnt = 0;
        int[] digit = new int[20];

        while(true){
            if (num < B){
                digit[cnt++] = num;
                break;
            }

            digit[cnt++] = num % B;
            num = num / B;
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(digit[i]);
        }
    }
}