import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ex4 {
    public static void main(String[] args) {
        List<String> diseases = new ArrayList<>();
        diseases.add("Cúm A");
        diseases.add("Sốt xuất huyết");
        diseases.add("Cúm A");
        diseases.add("Covid-19");
        diseases.add("Cúm A");
        diseases.add("Sốt xuất huyết");

        // TreeMap để đếm và tự động sắp xếp
        Map<String, Integer> report = new TreeMap<>();

        // Thống kê
        for (String disease : diseases) {
            if (report.containsKey(disease)) {
                report.put(disease, report.get(disease) + 1);
            } else {
                report.put(disease, 1);
            }
        }
        System.out.println("Bao cáo ca bệnh trong ngày:");
        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}