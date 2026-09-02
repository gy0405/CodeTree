import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        char[] arr = binary.toCharArray();
        int num = 0;

        for(int i = 0; i < arr.length; i++){
            num *= 2;
            num += (arr[i] - '0');
        }

        num *= 17;

        int cnt = 0;
        int[] digit = new int[20];

        while(true){
            if (num < 2){
                digit[cnt++] = num;
                break;
            }

            digit[cnt++] = num % 2;
            num = num / 2;
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(digit[i]);
        }
    }
}