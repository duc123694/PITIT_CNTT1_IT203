import java.util.Scanner;

public class miniProjects{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] studentList = new String[100];
        int size = 0;
        int choice;

        do {
            menu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    display(size, studentList);
                    break;

                case 2:
                    size = addStudentId(size, studentList);
                    break;

                case 3:
                    updateStudentId(size, studentList);
                    break;

                case 4:
                    size = deleteStudentId(size, studentList);
                    break;

                case 5:
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    }

    // Kiểm tra mã sinh viên
    public static boolean isValidMSSV(String mssv) {
        return mssv.matches("^B\\d{7}$");
    }

    // Hiển thị mã sinh viên
    static void display(int size, String[] list) {
        if (size == 0) {
            System.out.println("Danh sách mã sinh viên rỗng");
            return;
        }

        System.out.println("Danh sách MSSV:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + list[i]);
        }
    }

    // Thêm mã sinh viên
    static int addStudentId(int size, String[] list) {
        String mssv;

        do {
            System.out.print("Nhập mã sinh viên mới: ");
            mssv = sc.nextLine().trim();

            if (!isValidMSSV(mssv)) {
                System.out.println("Sai định dạng (VD: B1234567)");
            }
        } while (!isValidMSSV(mssv) );

        list[size++] = mssv;
        System.out.println("Thêm MSSV thành công");
        return size;
    }

    // Cập nhật mã sinh viên
    static void updateStudentId(int size, String[] list) {
        if (size == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }

        System.out.print("Nhập MSSV cần cập nhật: ");
        String oldMSSV = sc.nextLine();

        for (int i = 0; i < size; i++) {
            if (list[i].equalsIgnoreCase(oldMSSV)) {
                String newMSSV;
                do {
                    System.out.print("Nhập ma sinh viên mới: ");
                    newMSSV = sc.nextLine();

                    if (!isValidMSSV(newMSSV)) {
                        System.out.println("Sai định dạng");
                    }
                } while (!isValidMSSV(newMSSV));

                list[i] = newMSSV;
                System.out.println("Cập nhật thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy MSSV");
    }

    // Xóa mã sinh viên
    static int deleteStudentId(int size, String[] list) {
        if (size == 0) {
            System.out.println("Danh sách rỗng");
            return size;
        }

        System.out.print("Nhập MSSV cần xóa: ");
        String mssv = sc.nextLine();

        for (int i = 0; i < size; i++) {
            if (list[i].equalsIgnoreCase(mssv)) {
                for (int j = i; j < size - 1; j++) {
                    list[j] = list[j + 1];
                }
                size--;
                System.out.println("Xóa thành công");
                return size;
            }
        }

        System.out.println("Không tìm thấy mã sinh viên");
        return size;
    }



    // menu
    static void menu() {
        System.out.println("\nQuản lý mã sinh viên");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm mã sinh viên");
        System.out.println("3. Cập nhật mã sinh viên");
        System.out.println("4. Xóa mã sinh viên");
        System.out.println("5. Tìm kiếm mã sinh viên");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
    }
}
