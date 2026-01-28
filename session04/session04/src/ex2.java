public class ex2 {

    public static String xuLyMoTa(String moTa) {
        if (moTa == null || moTa.isEmpty()) {
            return moTa;
        }
        String lowerMoTa = moTa.toLowerCase();
        int index = lowerMoTa.indexOf("kệ:");

        if (index == -1) {
            return moTa;
        }
        String truoc = moTa.substring(0, index);
        int doDaiTuKhoa = moTa.substring(index, index + "Kệ:".length()).length();
        int startViTri = index + doDaiTuKhoa;

        String phanConLai = moTa.substring(startViTri).trim();

        // Tìm đến dấu phẩy hoặc hết chuỗi
        int ketThuc = phanConLai.indexOf(',');
        if (ketThuc == -1) {
            ketThuc = phanConLai.length();
        }

        String maViTri = phanConLai.substring(0, ketThuc).trim();
        String phanSau = (ketThuc < phanConLai.length())
                ? phanConLai.substring(ketThuc)
                : "";
        return truoc + "Vị trí lưu trữ: " + maViTri + phanSau;
    }

    public static void main(String[] args) {
        String[] testCases = {
                "Cuốn sách rất hay về lập trình. Kệ: A-12-03, xuất bản năm 2023."
        };

        for (int i = 0; i < testCases.length; i++) {
            String moTa = testCases[i];
            System.out.println("Trước : " + moTa);
            System.out.println("Sau   : " + xuLyMoTa(moTa));
        }
    }
}