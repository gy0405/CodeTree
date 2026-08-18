import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            if ( 'A' <=  str.charAt(i) && str.charAt(i) <= 'Z'){
                System.out.print((char) (str.charAt(i) + 32));
            }
            else if ('a' <=  str.charAt(i) && str.charAt(i) <= 'z'){
                System.out.print(str.charAt(i));

            }
            else if (48 <=  str.charAt(i) && str.charAt(i) <= 57){
                System.out.print(str.charAt(i));

            }
        }
    }
}