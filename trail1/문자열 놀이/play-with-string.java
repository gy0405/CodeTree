import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char[] arr = str.toCharArray();
        int qNum = sc.nextInt();

        for (int i = 0; i < qNum; i++){
            int q = sc.nextInt();

            if (q == 1){

            int a = sc.nextInt();
            int b = sc.nextInt();

                char temp1 = arr[a-1];
                char temp2 = arr[b-1];

                arr[a-1] = temp2;
                arr[b-1] = temp1;
            }
            else if (q == 2){

            char a = sc.next().charAt(0);
            char b = sc.next().charAt(0);

                for (int j = 0; j < arr.length; j++){
                    if (arr[j] == a){
                        arr[j] = b;
                    }
                }
            }

            
            str = String.valueOf(arr);
                
            System.out.println(str);

        }
    }
}