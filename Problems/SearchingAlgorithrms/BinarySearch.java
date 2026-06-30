package Problems.SearchingAlgorithrms;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch p = new BinarySearch();

        int arr[] = { 2, 3, 4, 10, 40 };
        int target  = 10;
        int result = p.binarySearch1(arr,target);
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
    public int binarySearch1(int arr[] ,int target){

        int low = 0 ,high = arr.length-1 ;
        while (low <= high ){
            if(low > high){
                return -1;
            }
            int mid = (low + high )/2;

            if(arr[mid] == target) return mid;

            if (target > arr[mid]){
                low = mid +1;
            }
            else high = mid -1 ;
        }
        return -1;
    }
}
