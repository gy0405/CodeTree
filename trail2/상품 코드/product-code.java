import java.util.Scanner;

class Product{
    String name = "codetree";
    int code = 50;

    public Product(){};

    public Product(String name, int code){
        this.name = name;
        this.code = code;
    }

    public void printPro(){
        System.out.printf("product %d is %s \n", this.code, this.name);
    }

};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.

        Product pro1 = new Product();
        pro1.printPro();

        Product pro2 = new Product(id2, code2);
        pro2.printPro();

    }
}