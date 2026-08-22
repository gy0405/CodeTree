import java.util.Scanner;
public class Main {

    public static void toN(int n){
        if (n == 0){
            return;
        }

        toN(n-1);

        System.out.print(n + " ");

    }

    public static void Nto(int n){
        if (n == 0){
            return;
        }

        System.out.print(n + " ");
        Nto(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        toN(n);
        System.out.println();
        Nto(n);
    }
}