import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String first = "ee";
        String second = "ab";

        String str = sc.next();

        if (str.contains(first)){
            System.out.print("Yes ");
        }
        else
            System.out.print("No ");

        if (str.contains(second)){
            System.out.print("Yes");
        }
        else
            System.out.print("No");
    }
}