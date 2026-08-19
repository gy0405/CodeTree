import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int answer = Integer.parseInt(a+b) + Integer.parseInt(b+a);

        System.out.println(answer);
    }
}