package ex1;

import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history = new Stack<>();
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm chỉnh sửa: " + action);
    }
    public EditAction undoEdit() {
        if (!history.isEmpty()) {
            EditAction removed = history.pop();
            System.out.println("Đã undo: " + removed);
            return removed;
        } else {
            System.out.println("Không có chỉnh sửa nào");
            return null;
        }
    }
    public EditAction getLatestEdit() {
        if (!history.isEmpty()) {
            return history.peek();
        } else {
            System.out.println("rỗng");
            return null;
        }
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa trống");
            return;
        }
        System.out.println("Lịch sư chỉnh sưa");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}