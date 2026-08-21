import java.util.Scanner;
public class Main {

    public static String text;
    public static String pattern; 
    public static int answer = -1;

    public static boolean isin(int idx){
        if (text.substring(idx, idx + pattern.length()).equals(pattern)){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();

        // Please write your code here.

        //인덱스마다 함수 호출
        for (int i = 0; i <= text.length() - pattern.length(); i++){
            if (isin(i)) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);

    }
}