import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = str.charAt(0);

        int num = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                num++;
            }
            else {
                sb.append(c).append(num);
                c = str.charAt(i);
                num = 1;
            }
        }

        sb.append(c).append(num);
        System.out.println(sb.toString().length());
        System.out.println(sb.toString());

    }
}