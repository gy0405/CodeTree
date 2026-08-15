import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        int num = 0;

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};

        for (String s : arr){
            if (s.charAt(2) == n || s.charAt(3) == n){
                System.out.println(s);
                num++;
            }
        }

        System.out.println(num);
    }
}