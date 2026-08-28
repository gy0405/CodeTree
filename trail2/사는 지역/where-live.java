import java.util.Scanner;
import java.util.Arrays;

class Person {
    String name;
    String addr;
    String city;

    public Person(){};

    public Person(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

    public void printPerson(){
        System.out.printf("name %s\n", this.name);
        System.out.printf("addr %s\n", this.addr);
        System.out.printf("city %s\n", this.city);
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            people[i] = new Person(name, addr, city);
        }

        Person lastPerson = people[0];
        for (int i = 1; i < n; i++) {
            if (people[i].name.compareTo(lastPerson.name) > 0) {
                lastPerson = people[i];
            }
        }
        
        lastPerson.printPerson();

    }
}
