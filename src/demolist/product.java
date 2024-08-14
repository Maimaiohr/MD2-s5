package demolist;

import java.util.Scanner;

public class product {
    private String id;
    private String name;
    private int price;

    //constructor
    public product() {
    }

    public product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // get, set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //nhap ttin
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id: ");
        id = sc.nextLine();
        System.out.println("Enter product name: ");
        name = sc.nextLine();
        System.out.println("Enter product price: ");
        price = sc.nextInt();
    }
    //hien thi
    public void showData(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
