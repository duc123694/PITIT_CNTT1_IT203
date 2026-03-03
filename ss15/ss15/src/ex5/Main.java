package ex5;

public class Main {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();
        EmergencyCase case1 = new EmergencyCase(
                new Patient("BN01", "Nguyễn A", 30));
        EmergencyCase case2 = new EmergencyCase(
                new Patient("BN02", "Trần B", 40));

        queue.addCase(case1);
        queue.addCase(case2);

        System.out.println();
        EmergencyCase current = queue.getNextCase();
        current.addStep(new TreatmentStep("Tiếp nhận", "10:00"));
        current.addStep(new TreatmentStep("Chẩn đoán", "10:10"));
        current.addStep(new TreatmentStep("Điều trị", "10:20"));
        System.out.println();
        current.displaySteps();
        System.out.println("\nUndo bước gần nhất:");
        current.undoStep();

        System.out.println();
        current.displaySteps();
    }
}