import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a1 = sc.next(); int a2 = sc.nextInt();
        String b1 = sc.next(); int b2 = sc.nextInt();
        String c1 = sc.next(); int c2 = sc.nextInt();

        int A = 0;

        if (a1.equals("Y")){
            if (a2 >= 37){
                A++;
            }
        }

        if (b1.equals("Y")){
            if (b2 >= 37){
                A++;
            }
        }

        if (c1.equals("Y")){
            if (c2 >= 37){
                A++;
            }
        }


        if (A >= 2){
            System.out.println('E');
        }
        else
            System.out.println('N');

    }
}