import java.util.HashSet;
import java.util.Set;

public class ex3 {
    public static void main(String[] args) {

        // Thành phần thuốc
        Set<String> drugComponents = new HashSet<>();
        drugComponents.add("Aspirin");
        drugComponents.add("Caffeine");
        drugComponents.add("Paracetamol");
        // Dị ứng
        Set<String> allergies = new HashSet<>();
        allergies.add("Penicillin");
        allergies.add("Aspirin");

        Set<String> warning = new HashSet<>(drugComponents);
        warning.retainAll(allergies);
        Set<String> safeComponents = new HashSet<>(drugComponents);
        safeComponents.removeAll(allergies);

        System.out.println("Cảnh báo dị ứng: " + warning);
        System.out.println("Thành phần an toàn: " + safeComponents);
    }
}