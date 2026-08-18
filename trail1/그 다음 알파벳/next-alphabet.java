import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch == 'z'){
            System.out.println('a');
        }
        else{
            System.out.println((char) (ch + 1)) ;
        }
    }
}