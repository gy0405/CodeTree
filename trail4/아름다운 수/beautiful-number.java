import java.util.*;

public class Main {
    public static int n, ans;

    public static ArrayList<Integer> l = new ArrayList<>();

    public static boolean isBeautiful(){
        for(int i = 0; i < n; i += l.get(i)){
            if(i + l.get(i) - 1 >= n){ //길이가 모자라지 않은지 체크
                return false;
            }
            for(int j = i; j < i + l.get(i); j++){//해당 블럭이 전부 같은 수로 이루어져있나
                if(l.get(j) != l.get(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void makingBeauty(int num){ //만들고 셈
        if(num == n){
            if(isBeautiful()){
                ans++;
            }
            return;
        }

        for(int i = 1; i <= 4; i++){
            l.add(i);
            makingBeauty(num + 1);
            l.remove(l.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.

        makingBeauty(0);

        System.out.println(ans);

    }
}