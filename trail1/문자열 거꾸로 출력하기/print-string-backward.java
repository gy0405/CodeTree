import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if (str.equals("END")){
                break;
            }

            for (int i = 0; i < str.length(); i++){
                System.out.print(str.charAt(str.length() - 1 - i));
            }

            System.out.println();
        }
    }
}