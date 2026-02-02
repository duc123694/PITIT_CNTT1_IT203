public class ex4 {
    public static double classFund = 0;
    public String studentName;
    public static void funding(String student, double amount){
        classFund += amount;
    }
    public static void viewBalance(){
        System.out.print("Fund: " + classFund);
    }
    public static void main(String[] args){
        funding("Nguyen Van A", 100000);
        funding("Nguyen Van B", 100000);
        funding("Nguyen Van C", 100000);
        funding("Nguyen Van D", 100000);
        viewBalance();
    }
}