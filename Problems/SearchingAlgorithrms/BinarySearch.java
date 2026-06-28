package Problems.SearchingAlgorithrms;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch p = new BinarySearch();
        int result = p.binarySearch1(16);
        System.out.println(result);
    }
//    Algorithm
    /*

    S1 : formula mid = ( low + high ) /2
    s2 :if mid = search return
        if mid > search low = mid+1
        else mid < Search high = mid-1
        loop until the search find
     */
    public int binarySearch1(int high){
        return 3;
    }
}
