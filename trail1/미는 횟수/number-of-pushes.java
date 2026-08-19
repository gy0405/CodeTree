import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int idx = -1;

        for (int i = 0; i < a.length(); i++){
            a = a.substring(a.length() -1) + a.substring(0, a.length() -1);

            if (a.equals(b)){
                idx = i + 1;
                //System.out.print(i+1);
                break;
            }
        }
        
        System.out.print(idx);
    }
}