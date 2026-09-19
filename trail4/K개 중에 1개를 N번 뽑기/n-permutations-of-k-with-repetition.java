import java.util.*;

public class Main {
    public static int k, n; //n번 반복 , 1이상 k이하
    public static ArrayList<Integer> selectedNums = new ArrayList<>();

    public static void printPermutation() {
        for(int i = 0; i < selectedNums.size(); i++){
            System.out.print(selectedNums.get(i) + " ");
        }
        System.out.println();
    }

    public static void findPermutations(int cnt){ //지금까지 cnt개의 숫자를 뽑았을 때 다음 어떤 숫자를 뽑을지
        if(cnt == n){ //반복 횟수가 n이 되면 프린트
            printPermutation();
            return;
        }

        for(int i = 1; i <= k; i++){ //1부터 k까지 뽑을거임
            selectedNums.add(i); //1, 2, 3 선택 후
            findPermutations(cnt + 1); //다음 거 호출
            selectedNums.remove(selectedNums.size() - 1); //끝까지 다다르면 퇴각
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        findPermutations(0);
    }
}