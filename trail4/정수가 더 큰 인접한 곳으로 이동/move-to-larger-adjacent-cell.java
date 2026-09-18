import java.util.*;

public class Main {
    public static final int MAX_N = 100;

    public static int n;
    public static int currX, currY;
    public static int[][] grid = new int[MAX_N + 1][MAX_N + 1];

    public static ArrayList<Integer> visitedNums = new ArrayList<>();
    
    public static boolean inRange(int x, int y){
        return 1 <= x && x <=n && 1 <= y && y <= n;
    }

    public static boolean canGo(int x, int y, int currNum){
        return inRange(x, y) && grid[x][y] > currNum;
    }

    public static boolean simulate() {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        for(int i = 0; i < 4; i++){
            int newX = currX + dx[i];
            int newY = currY + dy[i];

            if(canGo(newX, newY, grid[currX][currY])){
                currX = newX;
                currY = newY;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        currX = sc.nextInt();
        currY = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        visitedNums.add(grid[currX][currY]);

        while(true){
            boolean greaterNumberExist = simulate();

            if(!greaterNumberExist){
                break;
            }

            visitedNums.add(grid[currX][currY]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < visitedNums.size(); i++){
            if(i > 0) sb.append(' ');
            sb.append(visitedNums.get(i));
        }
        System.out.println(sb.toString());
    }
}