public class ex5 {
    public static final int MAX_SCORE = 100;
    public static final int MIN_SCORE = 0;
    public static final String SCHOOL_NAME = "Java Academy";

    public static void main(String[] args) {
        System.out.println("Trường: " + SCHOOL_NAME);
        System.out.println("Điểm tối đa cho phép: " + MAX_SCORE);

        // MAX_SCORE = 120;
        //==> Lỗi biên dịch vì final là định ngĩa hằng số không được phép thay đổi
        // Lỗi: cannot assign a value to final variable MAX_SCORE
    }
}