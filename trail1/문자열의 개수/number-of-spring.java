import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[200];
        int idx = 0;

        while(true){
            String str = sc.next();

            if (str.equals("0")){
                break;
            }

            arr[idx] = str;
            idx++;
        }

        System.out.println(idx);
        
        for (int i = 0; i < idx; i++){
            if (i % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}