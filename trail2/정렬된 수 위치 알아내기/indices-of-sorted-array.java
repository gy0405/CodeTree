import java.util.*;

class Number {
    int firstIdx;
    int secondIdx;
    int num;

    public Number(int firstIdx, int num){
        this.firstIdx = firstIdx + 1;
        this.num = num;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Number[] numbers = new Number[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            numbers[i] = new Number(i, arr[i]);
        }
        // Please write your code here.

        Arrays.sort(numbers, new Comparator<Number>(){
            @Override
            public int compare(Number a, Number b){
                if (a.num == b.num){
                    return a.firstIdx - b.firstIdx;
                }

            return a.num - b.num;
            }
        });

        for(int i = 0; i < n; i++){
            numbers[i].secondIdx = i + 1;
        }

        Arrays.sort(numbers, new Comparator<Number>(){
            @Override
            public int compare(Number a, Number b){
                return a.firstIdx - b.firstIdx;
            }
        });

        for(int i = 0; i < n; i++){
            System.out.print(numbers[i].secondIdx + " ");
        }


    }
}