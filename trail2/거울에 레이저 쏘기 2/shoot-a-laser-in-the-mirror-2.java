import java.util.*;
import java.io.*;

public class Main {
    public static int n, k, answer; //answer = 튕긴 카운트
    public static int row, col;
    public static char[][] grid;
    public static char dir;


    //레이저가 향하는 방향 + 거울의 종류에 따라 튕기는 방향이 달라진다
    // '/'의 경우 : 아래 > 왼쪽, 왼쪽 > 아래, 위 > 오른쪽, 오른쪽 > 위 mir
    // '\'의 경우 : 아래 > 오른쪽, 왼쪽> 위, 위 > 왼쪽, 오른쪽 > 아래 ror
    //range를 벗어나는 순간 answer를 프린트 한다.

    //처음 레이저를 판단할때, 1~n까지는 1행 > 1열, 2열, 3열 ... n열, 아래
    // n+1부터 2n까지는 n"열" 1행, 2행, 3행 ... n행, 왼쪽
    //2n+1부터 3n까지는 n행 n열, n-1열, ... 1열, 위쪽
    //3n+1부터 4n까지는 n"열 n행, n-1행, n-2행 ... 1행, 오른쪽

    public static boolean inRange(int row, int col){
        return 1<= row && row <= n && 1<= col && col <= n;
    }

    public static void forK(int k){
        if(1 <= k && k <= n){ //아래로
            dir = 'S';
            row = 1;
            col = k;  
        }
        else if(n+1 <= k && k <= 2*n){//왼쪽
            dir = 'W';
            row = k - n;
            col = n;
        }
        else if(2*n+1 <= k && k <= 3*n){//위
            dir = 'N';
            row = n;
            col = 3*n - k + 1; // 9 - 8 + 1 = 2
        }
        else{
            dir = 'E';
            row = 4*n - k + 1; //12 - 11 + 1 = 2
            col = 1;
        }
    }

    public static void changeDir(){ // 거울 종류와 dir에 따라 다음 dir과 col, row를 바꿔주는 함수
        if(grid[row][col] == '/'){  // '/'의 경우 : 아래 > 왼쪽, 왼쪽 > 아래, 위 > 오른쪽, 오른쪽 > 위 mir
            if(dir == 'N'){ // 위 > 오른쪽 (0 > 1)
                dir = 'E';
                col++;
            }
            else if(dir == 'E'){//오른쪽 > 위
                dir = 'N';
                row--;
            }
            else if(dir == 'S'){//아래 > 왼쪽
                dir = 'W';
                col--;
            }
            else{//왼쪽 > 아래
                dir = 'S';
                row++;
            }
        }
        else { // '\'의 경우 : 아래 > 오른쪽, 왼쪽> 위, 위 > 왼쪽, 오른쪽 > 아래 ror
            if(dir == 'N'){ // 위 > 왼쪽
                dir = 'W';
                col--;
            }
            else if(dir == 'E'){//오른쪽 > 아래
                dir = 'S';
                row++;
            }
            else if(dir == 'S'){//아래 > 오른쪽
                dir = 'E';
                col++;
            }
            else{//왼쪽 > 위
                dir = 'N';
                row--;
            }
        }
    }
        //row, col, dir는 아직 튕기지 않은 곳의 값임
        //해당 row, col 칸에서 거울 종류를 보고 answer ++ 튕긴 후에
        //그 튕긴 새로운 칸의 정보를 row, col에 갱신 후 mirror 재호출
        //이때, range를 벗어나면 그대로 answer을 프린트 하고 return;으로 종료 
    public static void mirror(){
        answer++;
        changeDir(); //dir이 바뀜
        //System.out.println(dir + " " + row + " " + col);

        if(inRange(row, col)){//간 위치가 아직 grid 안이면
            mirror();
        }
        else{
            System.out.println(answer);
            return;
        }
        
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        grid = new char[n+1][n+1]; //1부터 n까지

        for(int i = 1; i < n+1; i++){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();

            for(int j = 1; j < n+1; j++){
                grid[i][j] = temp.charAt(j-1);
            }
        }

        // for(int i = 1; i < n+1; i++){
        //     for(int j = 1; j < n+1; j++){
        //         System.out.print(grid[i][j]);
        //     }
        //     System.out.println();
        // }

        st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());

        //k를 판별하는 함수
        forK(k); //초기값 세팅 완료
        //System.out.println(dir + " " + row + " " + col);
        mirror();


        
    }
}