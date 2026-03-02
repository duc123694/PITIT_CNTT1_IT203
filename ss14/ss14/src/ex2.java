import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Map<String,String> medicineList = new HashMap<>();
        medicineList.put("T01", "Paracetamol");
        medicineList.put("T02", "Ibuprofen");
        medicineList.put("T03", "Amoxicillin");
        medicineList.put("T04", "Vitamin C");
        medicineList.put("T05", "Aspirin");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String code = sc.nextLine();

        if(medicineList.containsKey(code)){
            System.out.println("Tên thuốc: " + medicineList.get(code));
        }else {
            System.out.println("Thuốc k tồn tại");
        }
    }
}
