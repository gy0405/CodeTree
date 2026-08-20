import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] arr = change(a, b);

        System.out.println(arr[0] + " " + arr[1]);
    }

    public static int[] change(int a, int b){
        if (a > b){
            a *= 2;
            b += 10;
        }
        else {
            b *= 2;
            a += 10;
        }

        int[] arr = new int[]{a, b};

        return arr;
    }
}