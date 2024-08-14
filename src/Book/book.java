package Book;

import java.util.Scanner;

public class book {
    private String ID;
    private String title;
    private Float importPrice;
    private Float exportPrice;
    private String author;
    private float get;
    private int year;

    //constructor

    public book() {
    }

    public book(String ID, String title, Float importPrice, Float exportPrice, String author, float get, int year) {
        this.ID = ID;
        this.title = title;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.get = get;
        this.year = year;
    }

    //get and set

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Float importPrice) {
        this.importPrice = importPrice;
    }

    public Float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(Float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getGet() {
        return get;
    }

    public void setGet(float get) {
        this.get = get;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Nhap ttin
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        ID = sc.nextLine();
        System.out.println("Enter Title: ");
        title = sc.nextLine();
        System.out.println("Enter Import Price: ");
        importPrice = sc.nextFloat();
        System.out.println("Enter Export Price: ");
        exportPrice = sc.nextFloat();
        System.out.println("Enter Author: ");
        author = sc.nextLine();
        System.out.println("Enter Year: ");
        year = sc.nextInt();
    }
    //xuat thong tin
    public void showData(){
        System.out.println("ID: " + ID);
        System.out.println("Title: " + title);
        System.out.println("ImportPrice: " + importPrice);
        System.out.println("ExportPrice: " + exportPrice);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
    //tính lợi nhuận
    public void findGet(){
        this.get = this.exportPrice-importPrice;
        this.showData();
        System.out.println("lợi nhuận: " + this.get);
        //get = (exportPrice – importPrice);

    }

}
