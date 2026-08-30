import java.util.*;

class Person {
    String n;
    int h;
    int w;

    public Person(String n, int h, int w){
        this.n = n;
        this.h = h;
        this.w = w;
    }

    public void printPerson(){
        System.out.printf("%s %d %d\n", this.n, this.h, this.w);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();

            persons[i] = new Person(name[i], height[i], weight[i]);
        }

        // Please write your code here.

        Arrays.sort(persons, (a, b) -> a.h - b.h);

        for(int i = 0; i < n; i++){
            persons[i].printPerson();
        }
    }
}