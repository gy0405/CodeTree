import java.util.*;

public class Main {
    public static int n;
    public static ArrayList<Integer> l = new ArrayList<>();
    public static boolean[] visited = new boolean[10];

    public static void printP(){
        for(int i = 0; i < l.size(); i++){
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
    }

    public static void selectP(int num){ //num번 뽑았을 때, 다음에 뽑을 거 뽑기
        if(num == n){ //n번 뽑았으면 이제 프린트 하기
            printP();
            return;
        }

        for(int i = 1; i <= n; i++){
            if(!visited[i]){//방문하지 않았다면
                visited[i] = true; //방문으로 바꾸기
                l.add(i);
                selectP(num + 1);
                visited[i] = false;
                l.remove(l.size() - 1); //퇴각
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.

        selectP(0);
    }
}