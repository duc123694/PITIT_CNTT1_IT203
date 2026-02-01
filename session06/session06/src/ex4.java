public class ex4 {
    public static class Employee{
        public String employeeId;
        public String employeeName;
        public double salary;

        public Employee() {
        }

        public Employee(String employeeId, String employeeName) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
        }

        public Employee(String employeeId, String employeeName, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.salary = salary;
        }
        public void showInfo(){
            System.out.println("id nhân viên : "+ this.employeeId);
            System.out.println("tên nhân viên : " + this.employeeName);
            System.out.println("vuong : " +this.salary);
        }
    }

    public static void main(String[] args) {
        Employee nv1 = new Employee();
        Employee nv2 = new Employee("nv002" , "duc le");
        Employee nv3 = new Employee("nv003" , "vượng" ,1000 );

//        nv1.showInfo();
//        nv2.showInfo();
        nv3.showInfo();
    }
}