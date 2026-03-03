package ex4;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();
        eq.addPatient(new EmergencyPatient("1", "Nguyễn Anh Đức", 2));
        eq.addPatient(new EmergencyPatient("2", "Trần BInh", 1));
        eq.addPatient(new EmergencyPatient("3", "Lê Thị Hương", 2));
        eq.addPatient(new EmergencyPatient("4", "Phạm Đạt", 1));
        System.out.println();
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
    }
}
