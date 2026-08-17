import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        while (str.length() > 1){
            int n = sc.nextInt();

            if (n >= str.length()){
                //System.out.println("1번");
                str = str.substring(0, str.length()-1);
            }
            else if (n == 0){
                //System.out.println("2번");

                str = str.substring(1);
            }
            else {
                //System.out.println("3번");
                str = str.substring(0, n) + str.substring(n+1);
            }
            
            System.out.println(str);
        }

    }
}