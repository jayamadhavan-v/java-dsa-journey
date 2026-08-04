package Problems.famousBasic;

public class Happy_Number {
    public static void main(String[] args) {
        System.out.println( ishappy(110));
    }

    static  boolean ishappy(int n){
        while (n != 1 && n!= 4){
            int sum = 0;
            while (n > 0){
                sum += n%10 * n%10;
                n = n/10;
            }
            n = sum;
        }
        return n == 1;
    }

}
