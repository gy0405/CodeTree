import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int gender = sc.nextInt();
        int old = sc.nextInt();

        if (gender == 0){
            if (old >= 19){
                System.out.println("MAN");
            }
            else
                System.out.println("BOY");
        }
        else{
            if (old >= 19){
                System.out.println("WOMAN");
            }
            else
                System.out.println("GIRL");
        }
    }
}