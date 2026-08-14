import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.next().length();
        int b = sc.next().length();
        int c = sc.next().length();

        if(a>=b&&b>=c){
            System.out.print(a-c);
         }
         else if(a>=c&&c>=b){
            System.out.print(a-b);
         }
         else if(b>=a&&a>=c){
            System.out.print(b-c);
         }
         else if(b>=c&&c>=a){
            System.out.print(b-a);
         }
         else if(c>=a&&a>=b){
            System.out.print(c-b);
         }
         else if(c>=b&&b>=a){
            System.out.print(c-a);
         }

    }
}