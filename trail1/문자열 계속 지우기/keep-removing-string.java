import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        while (a.contains(b)){
            for (int i = 0; i <= a.length() - b.length(); i++){
                if (a.substring(i, i + b.length()).equals(b)){
                    a = a.substring(0, i) + a.substring(i + b.length());
                }
            }
        }
        
        System.out.println(a);
    }
}