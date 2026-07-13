package Problems.famousBasic;

public class Armstrong_Numbers {
    public static void main(String[] args) {
        Armstrong_Numbers obj = new Armstrong_Numbers();
        boolean result = obj.isArmStrong(153);

        System.out.println(result);

    }

    public boolean isArmStrong(int n) {

        int sum = 0;

        int  copy = n;

        while(copy != 0) {
           int rem = copy % 10;
           sum += (int) Math.pow(rem,3);
           copy /= 10;
        }
        return n == sum;
    }
}

