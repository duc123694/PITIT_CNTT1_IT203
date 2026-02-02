public class ex1 {
    String studentId;
    String fullName;
    static int totalStudent;

    public ex1(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
        totalStudent = totalStudent + 1;
    }

    public static void main(String[] args){
        ex1 student1 = new ex1("ST01", "Le Tien Duc");
    }
}