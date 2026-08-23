import java.util.Scanner;
public class Main {
    public static int num = 0;

    public static int f(int n){
        if (n == 1){
            return num;
        }

        if (n % 2 == 0){
            num++;
            return f(n/2);
        }
        else {
            num++;
            return f(n/3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(f(n));
    }
}