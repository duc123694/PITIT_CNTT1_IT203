import java.util.Date;
public class ex3 {
    public static void main(String[] args) {
        int soLuong = 10000; // Số lượng lớn để thấy sự khác biệt

        long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("BÁO CÁO HỆ THỐNG - ").append(new Date()).append("\n");

        for (int i = 1; i <= soLuong; i++) {
            sb.append("Mã: BK").append(i).append(" | Ngày: 28/01/2026\n");
        }
        String ketQua1 = sb.toString();
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        String ketQua2 = "BÁO CÁO HỆ THỐNG - " + new Date() + "\n";

        for (int i = 1; i <= soLuong; i++) {
            ketQua2 += "Mã: BK" + i + " | Ngày: 28/01/2026\n";
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Hoàn tất báo cáo với " + soLuong + " giao dịch.");
        System.out.println("Thời gian StringBuilder: " + (end1 - start1) + " ms");
        System.out.println("Thời gian cộng chuỗi (+): " + (end2 - start2) + " ms");
    }
}
