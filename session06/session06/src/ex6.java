public class ex6 {
    public static class User{
        private String id;
        private String username;
        private String password;
        private String email;

        public User(String id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            if(password.isEmpty()){
                System.out.println("Mật khẩu không hợp lệ");
            }else{
                this.password = password;
            }
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            if(email.endsWith("@gmail.com")){
                this.email = email;
            }else{
                System.out.println("Email không hợp lệ ");
            }
        }
        public void showInfo (){
            System.out.println("mã nhân viên : "+this.id);
            System.out.println("tên nhân viên : " +this.username);
//          System.out.println("mật khẩu : " +this.password);
            System.out.println("email : " +this.email);
        }
    }

    public static void main(String[] args) {
        User user1 = new User("001" , "nguyễn văn a" , "nva123" , "nva@gmail.com");
        user1.showInfo();

    }

}