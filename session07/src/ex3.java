public class ex3 {
    public static boolean checkIfPass(double score){
        if(score >= 5){
            return false;
        }else return true;
    };
    public static double average(double score1, double score2, double score3){
        return (score1 + score2 + score3) / 3;
    }
    public static void main(String[] args){
        if(checkIfPass(5)){
            System.out.print("Đạt");
        }else System.out.print("Không đạt");
        System.out.print(average(8,7,6));
    }
}