import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<Integer> v = new ArrayList<>();

    public static void calc(String str){
        if(str.charAt(1) == 'u'){
            String[] arr = str.split(" ");
            v.add(Integer.parseInt(arr[1]));
        }
        else if(str.charAt(1) == 'o'){
            String[] arr = str.split(" ");
            v.remove(v.size() - 1);
        }
        else if(str.charAt(1) == 'i'){
            System.out.println(v.size());
        }
        else if(str.charAt(1) == 'e'){
            String[] arr = str.split(" ");
            System.out.println(v.get(Integer.parseInt(arr[1]) - 1));
        }
    }
    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            calc(str);
        }
    }
}