import java.util.Scanner;

// Spy 정보를 나타내는 클래스 선언
class Spy {
    String secretCode;
    char meetingPoint;
    int time;

    public Spy(String secretCode, char meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        String sCode;
        char mPoint;
        int time;

        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();
        
        // Spy 객체를 만들어 줍니다.
        Spy sp = new Spy(sCode, mPoint, time);

        // 결과를 출력합니다.
        System.out.println("secret code : " + sp.secretCode);
        System.out.println("meeting point : " + sp.meetingPoint);
        System.out.println("time : " + sp.time);
    }
}
