import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        char[] aarr = a.toCharArray();
        char[] bbrr = b.toCharArray();

        bbrr[0] = aarr[0];
        bbrr[1] = aarr[1];

        b = String.valueOf(bbrr);

        System.out.println(b);
    }
}