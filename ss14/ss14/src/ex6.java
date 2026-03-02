import java.util.*;

class HospitalPatient {
    private String name;
    private int age;
    private String department;

    public HospitalPatient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ex6 {
    public static void main(String[] args) {

        // Danh sách bệnh nhân ban đầu
        List<HospitalPatient> patients = new ArrayList<>();
        patients.add(new HospitalPatient("Lan", 30, "Tim mạch"));
        patients.add(new HospitalPatient("Hùng", 45, "Nội tiết"));
        patients.add(new HospitalPatient("Mai", 28, "Tim mạch"));

        // Map gom nhóm theo khoa
        Map<String, List<HospitalPatient>> departmentMap = new HashMap<>();

        // Gom nhóm
        for (HospitalPatient p : patients) {
            String dept = p.getDepartment();

            if (!departmentMap.containsKey(dept)) {
                departmentMap.put(dept, new ArrayList<>());
            }

            departmentMap.get(dept).add(p);
        }

        // In cấu trúc Map
        System.out.println("CẤU TRÚC MAP:");
        for (Map.Entry<String, List<HospitalPatient>> entry : departmentMap.entrySet()) {
            System.out.println("Key \"" + entry.getKey() + "\" -> Value " + entry.getValue());
        }

        // Tìm khoa đông nhất
        String busiestDept = "";
        int max = 0;

        for (Map.Entry<String, List<HospitalPatient>> entry : departmentMap.entrySet()) {
            int size = entry.getValue().size();
            if (size > max) {
                max = size;
                busiestDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + busiestDept + " đang đông nhất (" + max + " bệnh nhân)");
    }
}