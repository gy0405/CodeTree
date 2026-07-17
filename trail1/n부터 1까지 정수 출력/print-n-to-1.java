import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = n;

        while(i > 0){
            System.out.print(i + " ");
            i--;
        }
    }
}