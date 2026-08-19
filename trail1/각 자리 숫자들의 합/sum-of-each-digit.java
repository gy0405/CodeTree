import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer = 0;

        for (int i = 0; i < str.length(); i++){
            answer += (int) str.charAt(i) - 48;
        }

        System.out.println(answer);
    }
}