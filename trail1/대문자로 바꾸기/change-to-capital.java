import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = 5;
        int cols = 3;
        String[][] arr = new String[rows][cols];

        for (int i = 0; i < rows; i++){
            arr[i] = br.readLine().split(" ");
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j].toUpperCase() + " ");
            }
            System.out.println();
        }


    }
}