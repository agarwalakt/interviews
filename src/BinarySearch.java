public class BinarySearch {

    public static int binSearch(int[] arr, int x){
        int start =0;
        int high = arr.length-1;
        int mid;

        while(start<=high){
            mid=(start+high)/2;
            if(arr[mid]<x){
                start=mid+1;
            }else if (arr[mid]>x){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
