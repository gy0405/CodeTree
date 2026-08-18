import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);


        if ((int) a > (int) b){
            System.out.println( ((int) a + (int) b) + " " + ((int) a - (int) b));
        }
        else {
            System.out.println( ((int) a + (int) b) + " " + ((int) b - (int) a));

        }
    }
}