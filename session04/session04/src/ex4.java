import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHập mã thẻ th viện:");
        String maThe = sc.nextLine();
        if(!maThe.matches("^[A-Z]{2}")){
            System.out.println("THiếu 2 chữ viết hoa");
        }else if(!maThe.matches("^[A-Z]{2} (19|20)\\d{2}.*")){
            System.out.println("Năm vào học k hợp lệ");
        } else if (!maThe.matches("^[A-Z]{2}(19|20)\\d{2}\\d{5}$")) {
            System.out.println(" Phải kết thúc bằng 5 chữ số");
        }else {
            System.out.println("Mã thẻ hợp lệ ");
        }

    }
}
