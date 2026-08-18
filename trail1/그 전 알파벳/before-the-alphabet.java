import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch == 'a'){
            System.out.println('z');
        }
        else{
            System.out.println((char) (ch - 1)) ;
        }
    }
}