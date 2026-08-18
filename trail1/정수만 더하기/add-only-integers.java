import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            if ('0' <=  str.charAt(i) && str.charAt(i) <= '9'){

                sum += str.charAt(i) - '0';

            }
        }

        System.out.println(sum);
    }
}