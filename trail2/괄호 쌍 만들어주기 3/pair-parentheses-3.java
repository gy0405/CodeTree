import java.util.Scanner;
public class Main {
    public static final int MAX_NUM = 100;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        int cnt = 0;

        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == '('){
                for(int j = i+1; j < A.length(); j++){
                    if(A.charAt(j) == ')'){
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);

        //포문 돌면서 여는 괄호 찾기 > 그 여는 괄호보다 뒤에 있는 닫는 괄호 수 세기


    }
}