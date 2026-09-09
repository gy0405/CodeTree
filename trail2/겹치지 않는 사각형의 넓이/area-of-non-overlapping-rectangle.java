import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();

        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();

        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        // A와 B를 1로 놓고 M을 -1로해서 뺀 다음 1인 것만 세면 됨
        //2000 이니까 2010, pointer 1005

        int[][] area = new int[2010][2010];
        int offset = 1005;

        //A 색칠
        for(int i = ax1; i < ax2; i++){
            for(int j = ay1; j < ay2; j++){
                area[i + offset][j + offset] = 1;
            }
        }
        //b 색칠
        for(int i = bx1; i < bx2; i++){
            for(int j = by1; j < by2; j++){
                area[i + offset][j + offset] = 1;
            }
        }
        //M빼기
        for(int i = mx1; i < mx2; i++){
            for(int j = my1; j < my2; j++){
                area[i + offset][j + offset]--;
            }
        }

        int answer = 0; //넓이, 1인거 세기

        for(int i = 0; i < area.length; i++){
            for(int j = 0; j < area[i].length; j++){
                if(area[i][j] == 1){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}