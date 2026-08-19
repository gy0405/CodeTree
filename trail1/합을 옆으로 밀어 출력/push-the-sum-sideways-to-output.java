import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum += sc.nextInt();
        }

        String answer = Integer.toString(sum);

        answer = answer.substring(1) + answer.substring(0, 1);

        System.out.println(answer);
    }
}