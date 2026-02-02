public class ex2 {
    public static int bienKieuNguyenThuy;
    String studentId;
    String fullName;

    public ex2(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }
    public static void main(String[] args){
        ex1 student = new ex1("ST01", "a");
        ex1 student2 = student;
        System.out.print(student == student2);
    }
}