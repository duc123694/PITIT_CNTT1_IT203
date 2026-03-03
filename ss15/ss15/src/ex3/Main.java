package ex3;

public class Main {
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();
        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(actions1);
        System.out.println();
        String[] actions2 = {"POP", "PUSH", "POP"};
        checker.checkProcess(actions2);
        System.out.println();
        String[] actions3 = {"PUSH", "PUSH", "POP"};
        checker.checkProcess(actions3);
    }
}