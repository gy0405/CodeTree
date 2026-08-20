import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        answer(arr);
        printarr(arr);
    }

    public static void answer(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                arr[i] = -arr[i];
            }
        }
    }

    public static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}