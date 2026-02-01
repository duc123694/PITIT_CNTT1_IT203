public class ex5 {
    public static class Book{
        public String book_id;
        public String book_name;

        public Book(String book_id, String book_name) {
            this.book_id = book_id;
            this.book_name = book_name;
        }

        public void showBook(){
            System.out.println("mã sách ; "+this.book_id);
            System.out.println("tên sách : "+this.book_name);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("B001" , "sách 1");

        book1.showBook();
    }
}