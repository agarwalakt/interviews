import java.util.Arrays;
//this needs work 10-25 11:8am
public class MergeSort {
    public static int[] sort(int[] input){
    int len = input.length;
    int mid = len/2;
    int[] leftArr = Arrays.copyOfRange(input, 0, mid);

    int[] rightArr = Arrays.copyOfRange(input,mid, len);

    if(len>2){
        sort(leftArr);
        sort(rightArr);
        merge(input, leftArr, rightArr);
    }

    System.out.println(Arrays.toString(leftArr));
    System.out.println(Arrays.toString(rightArr));
    return null;
    }
    public static int[] merge(int[] input, int[] left, int[] right){

        int[] res = new int[input.length];
        int i=0;
        int j=0;
        int k=0;

            if(left[i]<right[j]){
                res[k]=left[i];
                k++;
                i++;
            }else{
                res[k]=right[j];
                k++;
                j++;
            }


        if(i<left.length){
            res[k]=left[i];
            i++;
            k++;
        }
        if(j<right.length){
            res[k]=right[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(res));
        return res;

    }
}
