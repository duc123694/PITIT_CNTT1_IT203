package ex5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();
    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Đã tiếp nhận: " + c.getPatient());
    }
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn bệnh nhân chờ.");
            return null;
        }
        EmergencyCase next = cases.poll();
        System.out.println("Đang xử lý: " + next.getPatient());
        return next;
    }
}