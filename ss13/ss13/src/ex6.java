import java.util.*;

class Medicine {
    private String drugId;
    private String drugName;
    private double unitPrice;
    private int quantity;

    public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getDrugId() { return drugId; }
    public String getDrugName() { return drugName; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return unitPrice * quantity;
    }
}

public class ex6{
    static Scanner sc = new Scanner(System.in);
    static List<Medicine> medicineList = new ArrayList<>();
    public static Medicine findById(String id) {
        for (Medicine m : medicineList) {
            if (m.getDrugId().equals(id)) {
                return m;
            }
        }
        return null;
    }
    //Thêm thuốc
    public static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        Medicine existing = findById(id);

        if (existing != null) {
            System.out.print("Thuốc đã tồn tại. Nhập số lượng thêm: ");
            int addQty = Integer.parseInt(sc.nextLine());
            existing.setQuantity(existing.getQuantity() + addQty);
            System.out.println("Đã cập nhật số lượng!");
            return;
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int qty = Integer.parseInt(sc.nextLine());

        medicineList.add(new Medicine(id, name, price, qty));
        System.out.println("Thêm thuốc thành công!");
    }
    //Điều chỉnh số lượng thuốc
    public static void updateQuantity() {
        while (true) {
            System.out.print("Nhập mã thuốc cần chỉnh sửa: ");
            String id = sc.nextLine();

            Medicine m = findById(id);
            if (m == null) {
                System.out.println("Không tìm thấy thuốc! Vui lòng nhập lại.");
                continue;
            }

            System.out.print("Nhập số lượng mới: ");
            int newQty = Integer.parseInt(sc.nextLine());

            if (newQty == 0) {
                medicineList.remove(m);
                System.out.println("Thuốc đã bị xóa khỏi đơn.");
            } else {
                m.setQuantity(newQty);
                System.out.println("Cập nhật thành công!");
            }
            break;
        }
    }

    //  Xóa thuốc
    public static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        Medicine m = findById(id);
        if (m == null) {
            System.out.println("ID thuốc không tồn tại!");
            return;
        }

        medicineList.remove(m);
        System.out.println("Đã xóa thuốc khỏi đơn.");
    }

    //In hóa đơn
    public static void printInvoice() {
        if (medicineList.isEmpty()) {
            System.out.println("Danh sách thuốc trống!");
            return;
        }
        double grandTotal = 0;
        System.out.println("\n========= HÓA ĐƠN =========");
        System.out.printf("%-10s %-20s %-10s %-10s %-15s\n",
                "Mã", "Tên", "Giá", "SL", "Thành tiền");
        for (Medicine m : medicineList) {
            double total = m.getTotalPrice();
            grandTotal += total;
            System.out.printf("%-10s %-20s %-10.0f %-10d %-15.0f\n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    total);
        }
        System.out.println("----------------------------------------------");
        System.out.printf("tổng tiền: %.0f VNĐ\n", grandTotal);

        // Xóa đơn sau khi in
        medicineList.clear();
        System.out.println("Đã hoàn tất đơn thuốc. Danh sách đã được làm mới.");
    }

    //tìm thuốc giá rẻ
    public static void findCheapMedicine() {
        boolean found = false;

        System.out.println("Thuốc dưới 50.000 VNĐ:");
        for (Medicine m : medicineList) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m.getDrugId() + " - " + m.getDrugName() +
                        " - Giá: " + m.getUnitPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc giá rẻ.");
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Thêm thuốc vào đơn");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ (<50.000)");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}