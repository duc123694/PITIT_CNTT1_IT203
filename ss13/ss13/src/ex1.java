import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Double> temperatues = new ArrayList<>();
        temperatues.add(36.5);
        temperatues.add(40.2);
        temperatues.add(37.0);
        temperatues.add(12.5);
        temperatues.add(39.8);
        temperatues.add(99.9);
        temperatues.add(36.8);
        System.out.println("Danh sách ban đầu: " + temperatues);
        Iterator<Double> iterator = temperatues.iterator();
        while (iterator.hasNext()){
            double temp = iterator.next();
            if(temp < 34.0 || temp>42.0){
                iterator.remove();
            }
        }
        System.out.println("Danh sách sau khi lọc: " + temperatues);
        double sum = 0;
        for (double temp: temperatues){
            sum += temp;
        }
        double average = sum/temperatues.size();
        System.out.printf("Nhiệt độ trung bình: %.2f\n", average);
    }
}
