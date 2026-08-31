import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person){
        if (this.height == person.height){
            return person.weight - this.weight;
        }

        return this.height - person.height;
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

        Arrays.sort(persons);

        for(int i = 0; i < n; i++){
            System.out.printf("%s %d %d\n", persons[i].name, persons[i].height, persons[i].weight);
        }
    }
}
