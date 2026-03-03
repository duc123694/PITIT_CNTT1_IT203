package ex4;

import java.util.PriorityQueue;
import java.util.Comparator;

public class EmergencyQueue {
    private long counter = 0;
    private PriorityQueue<EmergencyPatient> queue =
            new PriorityQueue<>(new Comparator<EmergencyPatient>() {
                @Override
                public int compare(EmergencyPatient p1, EmergencyPatient p2) {
                    if (p1.getPriority() != p2.getPriority()) {
                        return p1.getPriority() - p2.getPriority();
                    }
                    return Long.compare(p1.getOrder(), p2.getOrder());
                }
            });
    public void addPatient(EmergencyPatient p) {
        p.setOrder(counter++);
        queue.offer(p);
        System.out.println("Đã thêm: " + p);
    }
    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return null;
        }
        EmergencyPatient p = queue.poll();
        System.out.println("Đang khám: " + p);
        return p;
    }
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi trống");
            return;
        }
        System.out.println("Danh sách chờ");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}