import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine().trim();

        System.out.print("Nhập tên tác giả: ");
        String tacGia = sc.nextLine().trim();

        System.out.print("NHập tên thể loại: ");
        String theLoai = sc.nextLine().trim();

        tenSach = chuanHoaKhoangTrang(tenSach);
        tacGia = chuanHoaKhoangTrang(tacGia);

        String tenSachUpper = tenSach.toUpperCase();
        String tacGiaTitle = toTitleCase(tacGia);

        String ketQua = "[" + tenSachUpper + "] - Tác Giả: " + tacGiaTitle;
        System.out.println(ketQua);
        sc.close();
    }
    public static String chuanHoaKhoangTrang (String s){
        if(s == null|| s.isEmpty()) return "";
        return  String.join("",s.trim().split("\\s+"));
    }
    public static String toTitleCase(String s){
        if(s == null || s.isEmpty()) return "";

        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<words.length;i++){
            String word = words[i];
            if(!word.isEmpty()){
                sb.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1).toLowerCase());
                if(i< words.length-1){
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
