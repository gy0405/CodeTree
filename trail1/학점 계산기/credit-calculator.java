import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] lines = br.readLine().split(" ");
        Double sum = 0.0;

        for (int i = 0; i < N; i++){
            Double x = Double.parseDouble(lines[i]);
            sum += x;
        }
        double avg = sum / (double)N;

        System.out.printf("%.1f", avg);
        System.out.println();
        
        if (avg >= 4.0){
            System.out.println("Perfect");
        }
        else if (avg >= 3.0){
            System.out.println("Good");
        }
        else
            System.out.println("Poor");
    }
}