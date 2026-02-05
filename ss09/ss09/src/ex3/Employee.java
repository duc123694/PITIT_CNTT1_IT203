package ex3;

public class Employee {
    protected  String ten;
    protected double luongCoBan;
    public  Employee (String ten, double luongCoBan){
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }
    public  void hienThi(){
        System.out.println("TêN: " + ten);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
}
