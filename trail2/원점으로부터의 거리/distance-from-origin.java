import java.util.*;

class Point implements Comparable<Point> {
    int x;
    int y;
    int distinct;
    int idx;

    public Point(int x, int y, int idx){
        
        if(x < 0){
            x = -x;
        }

        if(y < 0){
            y = -y;
        }

        this.x = x;
        this.y = y;
        this.idx = idx + 1;

        this.distinct = x + y;
    }

    @Override
    public int compareTo(Point point){
        if (this.distinct == point.distinct){
            return this.idx - point.idx;
        }
        return this.distinct - point.distinct;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];

        Point[] arr = new Point[n];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();

            arr[i] = new Point(points[i][0], points[i][1], i);
        }
        // Please write your code here.

        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            System.out.println(arr[i].idx);
        }
    }
}