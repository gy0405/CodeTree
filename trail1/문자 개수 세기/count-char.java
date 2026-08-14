import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = sc.next().charAt(0);

        int num = 0;

        for(int i = 0; i < a.length(); i++){
            if (a.charAt(i) == b){
                num++;
            }
        }

        System.out.println(num);
    }
}