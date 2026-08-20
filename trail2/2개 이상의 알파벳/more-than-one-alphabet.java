import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        String fin = answer(A);

        System.out.println(fin);
    }

    public static String answer(String str){
        char c = str.charAt(0);

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != c){
                return "Yes";
            }
        }

        return "No";
    }
}