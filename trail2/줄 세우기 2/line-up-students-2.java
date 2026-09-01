import java.util.*;

class Student implements Comparable<Student> {
    int h;
    int w;
    int idx;

    public Student(int h, int w, int idx){
        this.h = h;
        this.w = w;
        this.idx = idx + 1;
    }

    @Override
    public int compareTo(Student student){
        if (this.h == student.h){
            return student.w - this.w;
        }
        return this.h - student.h;
    }
}

public class Main {
    public static final int MAX_N = 1000;

    public static int[] h = new int[MAX_N];
    public static int[] w = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();

            students[i] = new Student(h[i], w[i], i);
        }
        // Please write your code here.

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            System.out.printf("%d %d %d\n", students[i].h, students[i].w, students[i].idx);
        }

    }
}
