import java.util.*;
import java.io.*;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++){
            list.add(Integer.parseInt(st.nextToken()));

            if(i % 2 == 0){
                Collections.sort(list);
                System.out.print(list.get(i /2) + " ");
            }
        }
        

    }
}