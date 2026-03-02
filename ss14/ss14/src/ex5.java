import java.util.Comparator;
import java.util.TreeSet;

class Patient {
    private String name;
    private int severity;      // 1: Nguy kịch, 2: Nặng, 3: Nhẹ
    private int arrivalTime;   // ví dụ 800 = 8:00, 815 = 8:15

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return name + " (Mức " + severity + ", đến lúc " + arrivalTime + ")";
    }
}

public class ex5 {
    public static void main(String[] args) {

        // Comparator theo quy tắc ưu tiên
        Comparator<Patient> priorityComparator = (p1, p2) -> {
            if (p1.getSeverity() != p2.getSeverity()) {
                return p1.getSeverity() - p2.getSeverity(); // so sánh severity trước
            }
            return p1.getArrivalTime() - p2.getArrivalTime(); // nếu bằng thì so sánh thời gian
        };

        TreeSet<Patient> queue = new TreeSet<>(priorityComparator);

        // Thêm bệnh nhân
        queue.add(new Patient("Bệnh nhân A", 3, 800));  // 8:00
        queue.add(new Patient("Bệnh nhân B", 1, 815));  // 8:15
        queue.add(new Patient("Bệnh nhân C", 1, 805));  // 8:05

        // In thứ tự xử lý
        System.out.println("Thứ tự xử lý:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}