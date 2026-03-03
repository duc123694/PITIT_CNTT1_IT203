package ex2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Đã thêm: " + p);
    }
    public Patient callNextPatient() {
        if (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println("Đang khám: " + p);
            return p;
        } else {
            System.out.println("Không còn bệnh nhân đợi");
            return null;
        }
    }
    public Patient peekNextPatient() {
        if (!queue.isEmpty()) {
            return queue.peek();
        } else {
            System.out.println("Hàng đợi trống");
            return null;
        }
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi hiện tại trống");
            return;
        }
        System.out.println("Danh sách chờ khám");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
