import java.util.*;
import java.io.*;
public class Main {
    public static int n, total, answer;
    public static int[] rooms;

    public static int dist(int start){
        //start 방에서 시작할 때 정해진 인원이 들어가는데 까지 거리를 반환하는 함수
        int people = total;
        int tempRoom = start; //현재 방 넘버
        int dist = 0; //거리

        while(people > 0){
            people -= rooms[tempRoom];
            tempRoom = (tempRoom + 1) % n;
            dist += people;
            //System.out.println(tempRoom + " "+ dist);
        }

        //System.out.println(dist);
        return dist;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        answer = Integer.MAX_VALUE;
        n = Integer.parseInt(st.nextToken());
        rooms = new int[n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            rooms[i] = Integer.parseInt(st.nextToken());
            total += rooms[i];
        }

        //시작하는 방을 계속 바꾸기


        for(int i = 0; i < n; i++){
            answer = Math.min(answer, dist(i));
        }


        System.out.print(answer);
        
    }
}