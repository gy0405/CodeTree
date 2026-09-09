import java.util.*;
import java.io.*;

class Tile {
    char color;
    int blackCnt;
    int whiteCnt;

    public Tile(){
        this.blackCnt = 0;
        this.whiteCnt = 0;
    };
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        //검은색 배열
        //흰색 배열
        //순서도 생각해야함... > 덮어 씌우는 방식으로 하고 cnt를 세서 회색으로 만들자
        //일반 배열 하나 (-1 검정, 1 흰색) + cnt 배열 하나 (검정횟수와 흰색 횟수를 카운트)
        // 차라리 클래스를 새로 만들어서 그 클래스 배열을 넣을까..
        Tile[] line = new Tile[2000010];

        for (int i = 0; i < line.length; i++) {
            line[i] = new Tile(); 
        }

        int pointer = 100005;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);
            
            //오른쪽, 검은색
            if (direction == 'R'){
                for(int j = 0; j < x; j++){
                    line[pointer].color = 'B';
                    line[pointer].blackCnt++;
                    pointer++;
                }
                pointer--;
            }
            //왼쪽, 흰색. 현재 타일 위치 포함
            else if (direction == 'L') {
                for(int j = 0; j < x; j ++){
                    line[pointer].color = 'W';
                    line[pointer].whiteCnt++;
                    pointer--;
                }
                pointer++;
            }
        }

        int black = 0;
        int white = 0;
        int gray = 0;
        
        for(Tile t : line){
            if (t.blackCnt >= 2 && t.whiteCnt >=2){
                gray++;
            }
            else {
                if (t.color == 'B'){
                    black++;
                }
                else if (t.color == 'W'){
                    white++;
                }
            }
        }

        System.out.println(white + " " + black + " " + gray);
    }
}