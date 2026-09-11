import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr;

    // 최대공약수 (재귀)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 두 수의 최소공배수
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    // 0번째부터 i번째까지의 최소공배수 (재귀)
    public static int solve(int i) {
        if (i == 0) {
            return arr[0];
        }
        return lcm(solve(i - 1), arr[i]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(n - 1));
    }
}