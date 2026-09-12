import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] monthNum = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // 1월 1일부터 (m, d)까지의 누적 일수를 구하는 함수 역할
        int dayCount1 = 0;
        for (int i = 1; i < m1; i++) {
            dayCount1 += monthNum[i];
        }
        dayCount1 += d1;

        int dayCount2 = 0;
        for (int i = 1; i < m2; i++) {
            dayCount2 += monthNum[i];
        }
        dayCount2 += d2;

        int diff = dayCount2 - dayCount1; 

        int idx = ((diff % 7) + 7) % 7;

        System.out.println(days[idx]);
    }
}