import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        LinkedList<Character> l = new LinkedList<>();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        //String s = br.readLine();
        char[] arr = br.readLine().toCharArray();

        for(char c : arr){
            l.add(c);
        }

        ListIterator<Character> it = l.listIterator(l.size());
        
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if(cmd.equals("L") && it.hasPrevious()){
                it.previous();
            }
            else if(cmd.equals("R") && it.hasNext()){
                it.next();
            }
            else if(cmd.equals("D") && it.hasNext()){
                it.next();
                it.remove();
            }
            else if(cmd.equals("P")){
                char s = st.nextToken().charAt(0);
                it.add(s);
            }
        }

        it = l.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
        
        // Please write your code here.
    }
}