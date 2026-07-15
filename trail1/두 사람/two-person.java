import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int ay = sc.nextInt();
        String ag = sc.next();
        int by = sc.nextInt();
        String bg = sc.next();

        if ( (ay >= 19 && ag.equals("M")) || (by >= 19 && bg.equals("M"))){
            System.out.println(1);
        }
        else
            System.out.println(0);

    }
}