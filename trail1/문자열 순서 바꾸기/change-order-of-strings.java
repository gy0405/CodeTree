import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        String temp = S;
        S = T;
        T = temp;

        System.out.println(S);
        System.out.println(T);

    }
}