package Book;

import demolist.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //List
        List<book> list = new ArrayList<book>();

        //menu
        do {
            System.out.println("==========MENU===========");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)");
            System.out.println("7. Thống kê số lượng sách theo năm xuất bản");
            System.out.println("8. Thống kê số lượng sách theo tác giả");
            System.out.println("9. Thoát");
            System.out.println("Mời bạn chọn từ 1 - 9");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap so luong sach can them");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        //tao doi tuong book
                        book book = new book();
                        //nhap ttin
                        book.inputData();
                        //add list
                        list.add(book);
                    }
                    break;
                case 2:
                    //tinh loi nhuan cho tung sach
                    for (book book : list) {
                        book.findGet();
                    }
                case 3:
                    System.out.println("====Books list=====");
                    for (book b : list) {
                        b.showData();
                    }break;
            }

        }while (true);
    }
}
