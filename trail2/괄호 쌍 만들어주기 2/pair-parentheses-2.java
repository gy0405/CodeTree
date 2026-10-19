import java.util.*;
import java.io.*;

public class Main {
    public static String str;

    public static int cntA() {
        int ans = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == '(' && str.charAt(i+1) == '('){
                //해당하는 i+1보다 더 뒤에 있는 걸 찾아야함
                ans += cntB(i+2);
            }
        }
        return ans;
    }

    public static int cntB(int sp) {
        int cnt = 0;
        for(int i = sp; i < str.length(); i++){
            if(str.charAt(i) == ')' && str.charAt(i-1) == ')'){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        str = st.nextToken();

        // (( 개수 * )) 개수 가 답인듯?
        // ((를 먼저 세고 그 다음 ))를 세서 두 개를 곱하자

        //그보다 뒤여야함.................................

        System.out.println(cntA());
        
    }
}