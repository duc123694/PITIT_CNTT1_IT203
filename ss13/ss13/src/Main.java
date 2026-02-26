import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<String> countries = new ArrayList<>();
        System.out.println("Nhập tên quốc gia");
        System.out.println("Nhập tên quốc gia:");

        while (true) {
            System.out.print("Nhập: ");
            String input = sc.nextLine();
            if (input.equals("0")) {
                break;
            }
            countries.add(input);
        }
        System.out.println("\nDanh sách quốc gia đã nhập:");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println((i + 1) + ". " + countries.get(i));
        }
    }
}
