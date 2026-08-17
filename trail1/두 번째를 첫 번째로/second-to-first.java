import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();

        char first = arr[0];
        char second = arr[1];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == second){
                arr[i] = first;
            }
        }

        str = String.valueOf(arr);

        System.out.println(str);

    }
}