package ex1;

public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();
        history.addEdit(new EditAction("Cập nhật triệu chứng", "10:00"));
        history.addEdit(new EditAction("Thêm kết quả xét nghiệm", "10:15"));
        history.addEdit(new EditAction("Chỉnh sửa đơn thuốc", "10:30"));
        System.out.println();
        history.displayHistory();

        System.out.println("Chỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        System.out.println("Undo:");
        history.undoEdit();

        System.out.println();
        history.displayHistory();
    }
}