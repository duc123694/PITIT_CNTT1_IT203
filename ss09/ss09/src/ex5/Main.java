package ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new OfficeEmployee("Nguyen Van A", 10000000));
        list.add(new ProductionEmployee("Tran Thi B", 300, 20000));
        list.add(new ProductionEmployee("Le Van C", 150, 30000));

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        int i = 1;
        for (Employee e : list) {

            double salary = e.calculateSalary();
            totalSalary += salary;

            if (e instanceof OfficeEmployee) {
                System.out.printf("%d. %s (Office) - Lương: %,.0f\n",
                        i++, e.getName(), salary);
            }

            else if (e instanceof ProductionEmployee) {
                ProductionEmployee p = (ProductionEmployee) e;

                System.out.printf("%d. %s (Production) - Lương: %,.0f (%d sản phẩm * %,.0f)\n",
                        i++, e.getName(), salary,
                        p.getNumOfProducts(), p.getPrice());
            }
        }

        System.out.printf("\n=> TỔNG LƯƠNG CÔNG TY: %,.0f", totalSalary);
    }
}