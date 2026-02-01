public class ex3 {
    public static class Product{
        private String product_id;
        private String product_name;
        private double price;

        public Product(String product_id, String product_name, double price) {
            this.product_id = product_id;
            this.product_name = product_name;
            this.price = price;
        }
        public String getProduct_id() {
            return product_id;
        }
        public String getProduct_name() {
            return product_name;
        }
        public double getPrice() {
            return price;
        }
        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }
        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }
        public void setPrice(double price) {
            if (price >0){
                this.price = price;
            }else {
                System.out.println("giá k hợp lệ , phải > 0");
            }
        }
        public void showProduct (){
            System.out.println("mã sản phẩm : " +this.product_id);
            System.out.println("tên sản phẩm : " +this.product_name);
            System.out.println("giá sản phẩm : " +this.price);
        }
    }
    public static void main(String[] args) {
        Product product1 = new Product("1" , "Sản phẩm 1" , 95.000);

        product1.showProduct();

        product1.setPrice(-1);
    }
}