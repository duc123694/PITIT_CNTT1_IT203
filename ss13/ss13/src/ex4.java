import java.util.LinkedList;

class EmergencyRoom {

    private LinkedList<String> queue = new LinkedList<>();

    // Bệnh nhân thường -> thêm cuối hàng đợi
    public void patientCheckIn(String name) {
        queue.addLast(name);
    }
    // Ca nguy kịch -> thêm vào đầu hàng đợi
    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }
    // Gọi bệnh nhân vào khám
    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return;
        }
        String patient = queue.removeFirst();
        // Nếu là ca khẩn cấp
        if (patient.equals("C")) {
            System.out.println("Đang cấp cứu: " + patient);
        } else {
            System.out.println("Đang khám: " + patient);
        }
    }
}
public class ex4 {
    public static void main(String[] args) {
        EmergencyRoom room = new EmergencyRoom();
        room.patientCheckIn("A");
        room.patientCheckIn("B");
        room.emergencyCheckIn("C");
        room.treatPatient();
        room.treatPatient();
        room.treatPatient();
    }
}