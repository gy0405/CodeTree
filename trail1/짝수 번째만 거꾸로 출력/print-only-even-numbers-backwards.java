import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = str.length()-1; i > -1; i--){
            if(i % 2 == 1){
                System.out.print(str.charAt(i));
            }
        }
    }
}