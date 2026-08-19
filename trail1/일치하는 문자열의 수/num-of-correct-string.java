import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int num = 0;

        for (int i = 0; i < n; i++){
            String x = sc.next();
            if (x.equals(a)){
                num++;
            }
        }

        System.out.println(num);
    }
}