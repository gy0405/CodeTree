import java.util.Scanner;
public class Main {
    public static int[] line = new int[250];

    public static void drawLine(int a, int b){
        for(int i = a; i < b; i++){
            line[i]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            drawLine(x1[i] + 100, x2[i] + 100);
        }
        // Please write your code here.

        int max = 0;
        int idx = 0;

        for(int i = 1; i < line.length; i++){
            if(max < line[i]){
                max = line[i];
                idx = i;
            }
        }

        System.out.print(line[idx]);
    }
}