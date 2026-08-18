import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.substring(1) + str.substring(0,1);

        System.out.println(str);
    }
}