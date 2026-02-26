import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (T item : listA) {
            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> khoaNoi1 = new ArrayList<>();
        khoaNoi1.add(101);
        khoaNoi1.add(102);
        khoaNoi1.add(105);

        List<Integer> khoaNgoai1 = new ArrayList<>();
        khoaNgoai1.add(102);
        khoaNgoai1.add(105);
        khoaNgoai1.add(108);

        List<Integer> common1 = findCommonPatients(khoaNoi1, khoaNgoai1);
        System.out.println("Test Case 1 Output: " + common1);
        List<String> khoaNoi2 = new ArrayList<>();
        khoaNoi2.add("DN01");
        khoaNoi2.add("DN02");
        khoaNoi2.add("DN03");

        List<String> khoaNgoai2 = new ArrayList<>();
        khoaNgoai2.add("DN02");
        khoaNgoai2.add("DN04");

        List<String> common2 = findCommonPatients(khoaNoi2, khoaNgoai2);
        System.out.println("Test Case 2 Output: " + common2);
    }
}