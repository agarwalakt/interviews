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

    public static int binSearchRecursive(int []input, int start, int high, int x){
        if(start>high){
            return -1;
        }
        int mid=(start+high)/2;
        if(input[mid]>x){
            int a=binSearchRecursive(input, start, mid-1, x);
            System.out.println(a);
            return a;
        }else if (input[mid]<x){
            int b=binSearchRecursive(input, mid+1, high, x);
            System.out.println(b);
            return b;
        }else {
            return mid;
        }

    }
}
