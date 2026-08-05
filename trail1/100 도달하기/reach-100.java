import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(N);

        while(list.get(list.size()-1) < 100){
            int next = list.get(list.size()-1) + list.get(list.size()  -2);
            list.add(next);
         }

         for (int num : list){
            System.out.print(num + " ");
         }

    }
}