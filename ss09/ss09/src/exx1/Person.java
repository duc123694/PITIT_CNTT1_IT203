package exx1;

public class Person {
    protected String hoTen;
    protected  int tuoi;

    public Person(){
        hoTen = "";
        tuoi = 0;
    }
    public  Person(String hoTen, int tuoi){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }
    public  void hienThi(){
        System.out.println("Họ tên: "+ hoTen);
        System.out.println("Tuổi: " + tuoi);
    }
}
