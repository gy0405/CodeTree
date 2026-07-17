import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(A / B);
        System.out.print(".");

        int r = A % B;
        for (int i = 0; i < 20; i++){
            r = r * 10;
            System.out.print(r / B);
            r = r % B;
        }

        
    }
}