import java.util.Scanner;

class Answer {
    String code;
    char rgb;
    int second;

    public Answer(String code, char rgb, int second){
        this.code = code;
        this.rgb = rgb;
        this.second = second;
    }

    public void printAnswer(){
        System.out.println("code : " + this.code);
        System.out.println("color : " + this.rgb);
        System.out.println("second : " + this.second);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        Answer answer = new Answer(uCode, lColor, time);

        answer.printAnswer();
    }
}