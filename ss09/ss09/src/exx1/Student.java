package exx1;

public class Student extends Person {
    private String maSV;
    private double diemTB;
    public Student(){
        super();
        maSV = "";
        diemTB = 0;
    }
    public  Student(String hoTen,int tuoi,String maSV,double diemTB){
        super(hoTen,tuoi);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }
    @Override
    public  void hienThi(){
        super.hienThi();
        System.out.println("mã sinh viên: " + maSV);
        System.out.println("Diểm TB: " + diemTB);
    }
}
