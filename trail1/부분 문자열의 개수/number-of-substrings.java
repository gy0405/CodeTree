import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int num = 0;

        for(int i = 0; i < a.length() -1; i++){
            if (a.substring(i, i+2).equals(b)){
                num++;
            }
        }

        System.out.print(num);
    }
}