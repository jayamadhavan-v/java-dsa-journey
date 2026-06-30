package Problems.Basic;

public class Square_Root {
    public static void main(String[] args) {
        Square_Root p = new Square_Root();
        int input  = 16;
        int result  = p.mySqrt(input);
        System.out.println(result);
        int inBuildFnResult = p.inBuild(input);
        System.out.println(inBuildFnResult);
    }
    public int mySqrt(int n){
        int mid = 0,low = 0,high = n;

        if(n <= 1) return n;

        // binary search alg
        while (low <= high){
            if (low == high) return mid;
            // formula
              mid =low +(high -low) /2;

            int sqr = mid*mid;
            if( sqr == n)  return  mid;
            else if( sqr  < n) low =  mid + 1 ;
            else  high = mid -1 ;
        }
        return mid;
    }

    public int inBuild(int n){
        return (int) Math.sqrt((double) n);
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
