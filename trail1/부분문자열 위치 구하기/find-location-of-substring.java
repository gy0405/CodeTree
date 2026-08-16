import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String in = sc.next();
        int idx = -1;

        for (int i = 0; i < str.length() - in.length() + 1; i++){
            if (str.substring(i, i + in.length()).equals(in)){
                idx = i;
                break;
            }
        }

        System.out.print(idx);
    }
}