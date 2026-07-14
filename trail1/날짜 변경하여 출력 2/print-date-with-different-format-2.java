import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String days = sc.next();

        String[] dayArr = days.split("-");

        String m = dayArr[0];
        String d = dayArr[1];
        String y = dayArr[2];

        System.out.printf("%s.%s.%s", y, m, d);
    }
}