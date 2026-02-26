import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ex2 {
    public  static List<String> removeandsort (List<String> inputList){
        List<String> uniquetList = new ArrayList<>();
        for (String medicine : inputList){
            if(!uniquetList.contains(medicine)){
                uniquetList.add(medicine);
            }
        }
        Collections.sort(uniquetList);
        return uniquetList;
    }

    static void main(String[] args) {
        List<String> medicine = new ArrayList<>();
        medicine.add("Paracetamol");
        medicine.add("Ibuprofen");
        medicine.add("Panadol");
        medicine.add("Paracetamol");
        medicine.add("Aspirin");
        medicine.add("Ibuprofen");
        System.out.println(medicine);
        List<String> result = removeandsort(medicine);
        System.out.println( result);
    }
}
