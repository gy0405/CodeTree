import java.util.Scanner;
public class Main {
    public static int[] arr = new int[100];

    public static void block(int A, int B){
        if (A > B){
            for(int i = B; i < A + 1; i++){
                arr[i]++;
            }
        }
        else if(A == B){
            arr[A]++;
        }
        else {
            for(int i = A; i < B + 1; i++){
                arr[i]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            block(A, B);
        }
        // Please write your code here.

        int max = 0;

        for(int i = 1; i < N + 1; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        // for(int i = 1; i < N + 1; i++){
        //     System.out.print(arr[i] + " ");
        // }

        System.out.print(max);

    }
}