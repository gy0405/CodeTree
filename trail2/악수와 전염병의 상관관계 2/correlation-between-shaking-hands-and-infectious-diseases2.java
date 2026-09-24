import java.util.*;
import java.io.*;

//개발자 > 번호, 전염 개수, 감염 여부
// 감염 - 감염 : 전염 1개씩 소모, 감염 - 정상 : 감염 (1회 차감), 정상(감염 후 k번 전염 개수 획득)

class Person{
    int num; //개발자 번호
    int shakeNum; //남은 감염 개수, k개
    boolean isInfected; //감염 여부

    public Person(int num, int shakeNum, boolean isInfected){
        this.num = num;
        this.shakeNum = shakeNum;
        this.isInfected = isInfected;
    }
}

public class Main {
    public static int n, k, p, t;
    public static Person[] persons;
    public static int[][] shakes;

    public static void doShake(int a, int b){//개발자 번호를 받아서 악수를 시키고, 결과를 persons객체 배열에 저장하는 함수
        //두 개발자 모두 감염이 되지 않았다면;
        if(persons[a].isInfected == false && persons[b].isInfected == false){
            return; //아무것도 하지 않는다.
        }
        else if(persons[a].isInfected == true && persons[b].isInfected == true){
            //두 개발자 모두가 감염이 되었다면
            persons[a].shakeNum--;
            persons[b].shakeNum--; //두 개발자의 shakeNum을 하나씩 줄인다.
            return;
        }
        else {//한쪽만 감염이 되었을 경우
            // 감염된 놈과 안된 놈을 먼저 찾아야하는데 뭐가 효율적일까
            int bad, good; //bad 감염된 놈, good 감염 안된놈
            if(persons[a].isInfected == true){
                bad = a;
                good = b;
            }
            else{
                bad = b;
                good = a;
            }

            if(persons[bad].shakeNum > 0){ // 감염자의 shakeNum이 0보다 클  때에만
                //먼저 감염당한 쪽 good을 바꿔주자
                persons[good].isInfected = true;
                persons[good].shakeNum = k;

                //그 다음 감염자 넘버 줄이기
                persons[bad].shakeNum--;
            }
            else{//감염자의 감염 횟수가 남지 않았다면;
                return;
            }

            return;

        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //개발자 총 몇 명
        k = Integer.parseInt(st.nextToken()); //감염 가능 횟수
        p = Integer.parseInt(st.nextToken()); //처음 감염된 개발자
        t = Integer.parseInt(st.nextToken()); //악수 기록(포문 돌릴 거)

        persons = new Person[n + 1]; //개발자들 배열 만들어주기 "1번부터 시작"

        for(int i = 1; i < n + 1; i++){ //1번부터 시작, 개발자 배열 채워주기 (0번은 안쓴다)
            if(i == p) //감염된 개발자 번호일시, 감염으로 만들어주기
                persons[i] = new Person(i, k, true);
            else
                persons[i] = new Person(i, 0, false);
        }

        shakes = new int[t][3]; //t개만큼 기록 3개

        //시간 순서대로 다시 소트해야 함 [고민] 악수 기록도 클래스를 쓸까? 아님 그냥 처리할까... 
        //소트가 쉬운 쪽으로 생각하는게 좋을듯 < 아니 근데 3중배열이 아니라 그냥 이중이잖아 이러면 람다써야지
        for(int i = 0; i < t; i++){//악수 기록 처리 > 시간, 번호1, 번호2
            st = new StringTokenizer(br.readLine());
            shakes[i][0] = Integer.parseInt(st.nextToken()); 
            shakes[i][1] = Integer.parseInt(st.nextToken()); 
            shakes[i][2] = Integer.parseInt(st.nextToken()); 
        }

        Arrays.sort(shakes, (a, b) -> Integer.compare(a[0], b[0]));

        //소트 잘 되었는지 디버깅 용
        // for(int i = 0; i < t; i++){//악수 기록 처리 > 시간, 번호1, 번호2
        //     System.out.print(shakes[i][0]);
        //     System.out.print(shakes[i][1]);
        //     System.out.print(shakes[i][2]);
        //     System.out.println();
        // }

        //이제 악수 배열 사용해서 앞에서부터 차례차례로 이행해줘야함
        //악수하는 함수를 만들자. doShake void로 만들고 개발자 객체 배열을 조작하는거임

        for(int i = 0; i < t; i++){
            doShake(shakes[i][1], shakes[i][2]);
        }

        boolean[] answer = new boolean[n + 1]; //개발자 숫자만큼 배열 만들어주기, 0은 안쓸거임

        for(int i = 1; i < n + 1; i++){
            answer[i] = persons[i].isInfected; //음성이면 false 양성이면 true
        }


        for(int i = 1; i < n + 1; i++){
            if(answer[i]) System.out.print(1);
            else System.out.print(0);
        }

    }
}