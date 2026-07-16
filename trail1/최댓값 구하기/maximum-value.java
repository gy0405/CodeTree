import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b){
            if (a >= c){
                System.out.println(a);
            }
            else
                System.out.println(c);
        }
        else if ( b >= a)
            if (b >= c ){
                System.out.println(b);
            }
            else
                System.out.println(c);
        else if (c >= a){
            if (c > b){
                System.out.println(c);
            }
            else
                System.out.println(b);
        }
    }
}