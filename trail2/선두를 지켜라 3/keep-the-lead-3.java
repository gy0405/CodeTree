import java.util.*;
import java.io.*;

//a는 n개 구간, b는 m개 구간
//명예의 전당 조합이 바뀌면 cnt++, 1시간마다 가장 선두에 있는 사람
//a와 b가 움직인 시간의 총합은 항상 같음

public class Main {
    public static int n, m, time, aDistance, bDistance, answer;
    public static String currHonor = "";
    public static ArrayList<int[]> aVelo = new ArrayList<>();
    public static ArrayList<int[]> bVelo = new ArrayList<>();

    public static void aWhere(){ //한 시간동안 a가 간 거리를 계산해주는 함수 aWhere
        //aVelo 함수를 쭉 돌면서 시간이 0이 아니면 시간을 줄이고 거리를 더해주자
        if(aVelo.isEmpty()) return;

        aDistance += aVelo.get(0)[0]; //a거리 더하기
        aVelo.get(0)[1]--;

        if(aVelo.get(0)[1] == 0){ // 맨 앞의 값의 [1]이 0이되면
            aVelo.remove(0); //그걸 아예 없앤다
        }
    }

    public static void bWhere(){
        if(bVelo.isEmpty()) return;

        bDistance += bVelo.get(0)[0]; //a거리 더하기
        bVelo.get(0)[1]--;

        if(bVelo.get(0)[1] == 0){ // 맨 앞의 값의 [1]이 0이되면
            bVelo.remove(0); //그걸 아예 없앤다
        }
    }

    public static void whosHonor(){ //명예의 전당을 기록하고 바뀔시 카운트(앤서)를 ++하는 함수
        String newHonor = "";
        
        if(aDistance > bDistance) newHonor = "a";
        else if(bDistance > aDistance) newHonor = "b";
        else newHonor = "ab";

        //System.out.println(aDistance + " " + bDistance);

        if(newHonor != currHonor){
            answer++;
            currHonor = newHonor;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            aVelo.add(new int[]{v, t});

            time += t; //총 시간 구하기
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            bVelo.add(new int[]{v, t});
        }

        while(time-- > 0){ //시간이 0이 되기 전까지
            aWhere();
            bWhere();

            //명예의 전당을 기록하고 바뀔시 카운트(앤서)를 ++하는 함수
            whosHonor();
        }

        System.out.println(answer);
        
    }
}