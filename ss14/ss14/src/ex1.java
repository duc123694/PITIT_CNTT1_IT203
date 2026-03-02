import java.util.LinkedHashSet;
import java.util.Set;

public class ex1 {
    static void main(String[] args) {
        Set<String> patient = new LinkedHashSet<>();
        patient.add("Nguyễn Văn A – Yên Bái");
        patient.add("Trần Thị B – Thái Bình");
        patient.add("Nguyễn Văn D – Yên Bái");
        patient.add("Lê Văn C – Hưng Yên");

        System.out.println("Danh sách gọi khám:");
        for(String name : patient){
            System.out.println(name);
        }
    }
}
