import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String inta = "";
        String intb = "";

        for (int i = 0; i < a.length(); i++){
            if ( '0' <= a.charAt(i) && a.charAt(i) <= '9'){
                inta += a.charAt(i);
            }
        
        }

        for (int i = 0; i < b.length(); i++){
            if ( '0' <= b.charAt(i) && b.charAt(i) <= '9'){
                intb += b.charAt(i);
            }
            
        }

        int answer = Integer.parseInt(inta) + Integer.parseInt(intb);

        System.out.println(answer);
    }
}