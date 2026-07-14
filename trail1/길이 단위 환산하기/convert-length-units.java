import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        N = 30.48 * N;

        System.out.printf("%.1f", N);

    }
}