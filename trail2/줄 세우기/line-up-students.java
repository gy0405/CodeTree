import java.util.*;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int idx;

    public Student(int height, int weight, int idx){
        this.height = height;
        this.weight = weight;
        this.idx = idx + 1;
    }

    @Override
    public int compareTo(Student student){
        if (student.height == this.height){
            if (student.weight == this.weight){
                return this.idx - student.idx;
            }
            else {
                return student.weight - this.weight;
            }
        }

        return student.height - this.height;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();

            students[i] = new Student(height[i], weight[i], i);
        }
        // Please write your code here.

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            System.out.printf("%d %d %d\n", students[i].height, students[i].weight, students[i].idx);
        }
    }
}