import java.util.*;

//집 하나씩 선택해서 포문으로 돌고 배열에 넣기
//배열 소트 한 다음에 최솟값 출력

public class Main {
    public static final int MAX_NUM = 100;

    public static int n;
    public static int[] a = new int[MAX_NUM + 1]; //사는 사람 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int minDist = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += a[j] * Math.abs(i - j);
            }
            minDist = Math.min(minDist, sum);
        }
        
        System.out.println(minDist);

    }
}