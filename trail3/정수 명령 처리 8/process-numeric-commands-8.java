import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> l = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            // Please write your code here.
            if (order.equals("push_front")){
                int a = Integer.parseInt(st.nextToken());
                l.addFirst(a);
            }
            else if (order.equals("push_back")){
                int a = Integer.parseInt(st.nextToken());
                l.addLast(a);
            }
            else if (order.equals("pop_front")){
                System.out.println(l.pollFirst());
            }
            else if (order.equals("pop_back")){
                System.out.println(l.pollLast());
            }
            else if (order.equals("size")){
                System.out.println(l.size());
            }
            else if (order.equals("empty")){
                if(l.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if (order.equals("front")){
                System.out.println(l.peekFirst());
            }
            else if (order.equals("back")){
                System.out.println(l.peekLast());
            }
        }
    }
}