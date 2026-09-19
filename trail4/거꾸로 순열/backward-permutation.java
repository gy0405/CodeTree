import java.util.*;

public class Main {
    public static int n;
    public static boolean[] visited = new boolean[10];

    public static ArrayList<Integer> l = new ArrayList<>();

    public static void printP(){
        for(int i = 0; i < l.size(); i++){
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
    }

    public static void findP(int num){
        if (num == n){
            printP();
            return;
        }

        for(int i = n; i > 0; i--){
            if(!visited[i]){
                visited[i] = true;
                l.add(i);

                findP(num + 1);

                visited[i] = false;
                l.remove(l.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.

        findP(0);
    }
}