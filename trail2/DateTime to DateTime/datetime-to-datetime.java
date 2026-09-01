import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        int eleven = 11 + 11 * 60 + 11 * 24 * 60;
        int answer = C + B * 60 + A * 24 * 60;

        if (answer < eleven){
            System.out.println(-1);
        }
        else {
            System.out.print(answer - eleven);
        }
    }
}