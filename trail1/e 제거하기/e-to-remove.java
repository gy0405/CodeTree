import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'e'){
                str = str.substring(0, i) + str.substring(i + 1);
                break;
            }
        }
        
        System.out.println(str);

    }
}