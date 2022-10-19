public class Binary_Search {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,12,23,34,47,58,62,74,85,90};
        int target = 23;
        int ans = binarySearch(arr, target);
        System.out.println("The element in array found in index : "+ans);
    }


    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;     // (start + end)/2 ,,, not for long(huge integer)

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
