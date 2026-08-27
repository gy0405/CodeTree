import java.util.Scanner;

class User {
    char codeName;
    int score;
}

public class Main {
    public static final int MAX_N = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User[] users = new User[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            users[i] = new User();
            users[i].codeName = sc.next().charAt(0);
            users[i].score = sc.nextInt();
        }

        // Please write your code here.

        int min = users[0].score;
        int idx = 0;

        for(int i = 0; i < 5; i++){
            if (min > users[i].score){
                min = users[i].score;
                idx = i;
            }
        }

        System.out.print(users[idx].codeName + " " + users[idx].score);
    }
}
