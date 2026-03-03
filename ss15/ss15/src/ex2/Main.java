package ex2;

public class Main {
    public static void main(String[] args) {

        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("1", "Nguyễn Việt anh", 30));
        pq.addPatient(new Patient("2", "Trần Thị Lan Anh", 25));
        pq.addPatient(new Patient("3", "Lê Thị Dung", 40));

        System.out.println();
        pq.displayQueue();

        System.out.println("\nBệnh nhân tiếp:");
        System.out.println(pq.peekNextPatient());

        System.out.println("\nGọi bệnh nhân:");
        pq.callNextPatient();

        System.out.println();
        pq.displayQueue();
    }
}
