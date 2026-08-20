import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        isPalin(input);
    }

    public static void isPalin(String str){
        String palin = "";

        for(int i = 0; i < str.length(); i++){
            palin += str.charAt(str.length()- 1 - i);
        }

        if (str.equals(palin)){
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}