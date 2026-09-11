import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();

        List<String> chosen = new ArrayList<>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            boolean ischosen = true;

            if(str.length() < t.length()){
                continue;
            }

            for(int j = 0; j < t.length(); j++){
                if(str.charAt(j) == t.charAt(j)){
                    continue;
                }
                else{
                    ischosen = false;
                    break;
                }
            }

            if(ischosen){
                chosen.add(str);
            }
        }

        Collections.sort(chosen);

        System.out.println(chosen.get(k-1));
    }
}