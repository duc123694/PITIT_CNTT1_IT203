import java.util.*;

class Patient {
    private String id;
    private String fullName;
    private int age;
    private String diagnosis;

    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getId() { return id; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public String getDiagnosis() { return diagnosis; }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return id + " | " + fullName + " | Tuổi: " + age + " | Chẩn đoán: " + diagnosis;
    }
}

public class ex5 {

    static ArrayList<Patient> patientList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // ===== Tìm bệnh nhân theo ID =====
    public static Patient findById(String id) {
        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // ===== 1. Tiếp nhận bệnh nhân =====
    public static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        if (findById(id) != null) {
            System.out.println("ID đã tồn tại!");
            return;
        }

        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Tiếp nhận thành công!");
    }

    // ===== 2. Cập nhật chẩn đoán =====
    public static void updateDiagnosis() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();

        Patient p = findById(id);
        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        System.out.print("Nhập chẩn đoán mới: ");
        String newDiagnosis = sc.nextLine();
        p.setDiagnosis(newDiagnosis);

        System.out.println("Cập nhật thành công!");
    }

    // ===== 3. Xuất viện =====
    public static void dischargePatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = sc.nextLine();

        Patient p = findById(id);
        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        patientList.remove(p);
        System.out.println("Đã xuất viện!");
    }

    // ===== 4. Sắp xếp =====
    public static void sortPatients() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge(); // Tuổi giảm dần
                }

                return p1.getFullName().compareToIgnoreCase(p2.getFullName()); // Tên A-Z
            }
        });

        System.out.println("Danh sách sau khi sắp xếp:");
        for (Patient p : patientList) {
            System.out.println(p);
        }
    }

    // ===== MENU =====
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}