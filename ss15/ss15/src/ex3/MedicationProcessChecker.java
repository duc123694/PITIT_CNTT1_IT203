package ex3;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();
    public boolean checkProcess(String[] actions) {
        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];
            if (action.equals("PUSH")) {
                stack.push(action);
            }
            else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("LỖI");
                    return false;
                }
                stack.pop();
            }
            else {
                System.out.println("Hành động không hợp lệ: " + action);
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Kết thúc ca trực nhưng vẫn còn ");
            return false;
        }

        System.out.println("Quy trình hopej lệ");
        return true;
    }
}