package Problems.Basic;

public class Square_Root {
    public static void main(String[] args) {
        Square_Root p = new Square_Root();
        int result  = p.mySqrt(81);
        System.out.println(result);
    }
    public int mySqrt(int n){

        int high = n;
        if( high == 0){
            return 0;
        }

        // binary search alg

        int mid =0,low =0;

        while (low <= high){
            mid = (low + high )/2;
            if( mid * mid == n){
                return mid;
            }
            else if( mid * mid < n) {
                low =  mid + 1 ;
            }
            else {
                high = mid -1 ;

            }
        }
        return mid;
    }
//    algorithm
/*
    To find perfect square Root using the binary Search
     S1 : formula mid = ( low + high ) /2
     s2 :if mid = search return
        if mid > search low = mid+1
        else mid < Search high = mid-1
        loop until the search find
 */
}
