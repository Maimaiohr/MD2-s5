package demolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static <Product> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //list
        List<product> list = new ArrayList<product>();

        //menu
        do {
            System.out.println("==========MENU===========");
            System.out.println("1. Thêm mới sản phẩm ");
            System.out.println("2. Hiển thị danh sách sản phẩm ");
            System.out.println("3. Thoát chương trình ");
            System.out.println("Mời bạn chọn từ 1 - 3");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:

                    // khởi tạo đối tượng sản phẩm
                    product product = new product();
                    // gọi đến phương thức inputData
                    product.inputData();
                    // add đối tượng vừa tạo vào danh sách List
                    list.add(product);
                    break;
                    case 2:
                        System.out.println("=========Danh sách sản phẩm =========");
                        for (product item : list) {
                            item.showData();
                        }
                        break;
                        case 3:
                            System.exit(0);
                            break;
                default:
                    System.out.println("Sai lựa chọn");
            }

        }while (true);
    }
}
