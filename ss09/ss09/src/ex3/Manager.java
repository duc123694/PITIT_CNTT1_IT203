package ex3;

class Manager extends Employee {
    private String phongBan;

    public Manager(String ten, double luongCoBan, String phongBan) {
        super(ten, luongCoBan);
        this.phongBan = phongBan;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Phòng ban: " + phongBan);
    }
}
