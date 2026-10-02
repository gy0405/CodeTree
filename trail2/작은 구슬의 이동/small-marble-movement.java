import java.util.*;
import java.io.*;

//상하좌우 중 특정 방향으로 1초에 한 칸씩 움직임
//방향을 바꾸는데 1초가 소모됨 (방향 바꾸기 연산 재화 = 1)
//이동 연산 재화 = 1


public class Main {
    public static int n, t;
    public static int row, col, dir;
    public static int[][] grid;

    //0 = R, 1 = U, 2 = L, 3 = D;
    public static int[] dx = {0, -1, 0, 1}; //row
    public static int[] dy = {1, 0, -1, 0}; //col

    public static void changeDir(){//방향 바꾸는 함수
        dir = (dir + 2) % 4;
    }

    public static void movePos(){//이동하는 함수
        row += dx[dir];
        col += dy[dir];
    }

    public static boolean canGo(int tempX, int tempY){//갈 수 있는지 확인하는 함수
        tempX += dx[dir];
        tempY += dy[dir];

        return 1 <= tempX && tempX <= n && 1 <= tempY && tempY <= n;
    }

    public static int initDir(char cDir){
        switch(cDir){
            case 'R':
                return 0;
            case 'U':
                return 1;
            case 'L':
                return 2;
            case 'D':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //n행 n열
        t = Integer.parseInt(st.nextToken()); //t초 후 구슬의 위치

        grid = new int[n+1][n+1]; //1부터 n까지 사용할 것임

        st = new StringTokenizer(br.readLine());
        
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        
        dir = initDir(st.nextToken().charAt(0));

        while(t-- > 0){

            //System.out.println(x + " " + y);
            //System.out.println(dir);

            if(canGo(row, col)){
                //현재 갈 수 있다면, 구슬 이동 함수를 실행한다.
                //System.out.println("yes");
                movePos();
            }
            else{
                //현재 갈 수 없다면, 방향 바꾸기 연산을 시행한다.
                //System.out.println("no");
                changeDir();
            }
        }

        System.out.println(row + " " + col);

    }
}