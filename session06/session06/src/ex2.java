import java.util.Scanner;

public class ex2 {
    public static class Account {
        public String username ;
        public String password;
        public String email;

        public Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public void updatePassword(){
            System.out.print("Mời bạn nhập mật khẩu muốn đổi : ");
            Scanner scanner = new Scanner(System.in);

            String newPass = scanner.nextLine();

            this.password = newPass;
            System.out.println("Đổi mật khẩu thành công");
        }
        public void showInfo(){
            System.out.println("tên tài khoản : " +this.username);
            System.out.println("email : " +this.email);
        }

    }

    public static void main(String[] args) {
        Account acc1 = new Account("Nguyễn Văn A" , "abc" , "nva@gmail.com");
        Account acc2 = new Account("Nguyễn Thị B" , "def" , "ntb@gmail.com");


        acc1.updatePassword();
        acc1.showInfo();
    }
}