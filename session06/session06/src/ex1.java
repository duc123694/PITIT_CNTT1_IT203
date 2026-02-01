public class ex1 {

    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTrungBinh;

    public ex1(String maSV, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void show() {
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }

    public static void main(String[] args) {

        ex1 sv1 = new ex1(
                "12345",
                "Lê Tiến Đức",
                2006,
                10
        );
        sv1.show();
    }
}
