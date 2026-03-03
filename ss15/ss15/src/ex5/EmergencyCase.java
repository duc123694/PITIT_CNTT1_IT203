package ex5;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();
    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Đã thêm bước: " + step);
    }
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước nào để undo");
            return null;
        }
        TreatmentStep removed = steps.pop();
        System.out.println("Đã undo: " + removed);
        return removed;
    }
    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý");
            return;
        }
        System.out.println("Các bước xử lý");
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }
    public Patient getPatient() {
        return patient;
    }
}