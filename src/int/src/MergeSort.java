import java.util.Arrays;

public class MergeSort {

	public static int[] merge(int[] input) {
		
		int len = input.length;
		
		if(len>=2) {
			int mid = len/2;
			//System.out.println(mid+ " " + len);
			int[] leftArr = Arrays.copyOfRange(input,0, mid);
			int[] rightArr = Arrays.copyOfRange(input,mid ,len);
			
			merge(leftArr);
			merge(rightArr);
			System.out.println("left : "+ Arrays.toString(leftArr));
			System.out.println("right: "+ Arrays.toString(rightArr));
			int[] first= sort(leftArr, rightArr, input);
			System.out.println("first method : "+ Arrays.toString(first));
			return first;
		}
		
		return null;

	}
	public static int[] sort(int[] left, int[] right, int[] a) {
		int ll= left.length;
		int rl=right.length;
		int i = 0;
		int j= 0;
		int k=0;
		//int[] a= new int[ll+rl];
		while(i<ll && j<rl) {
			if(left[i]<right[j]) {
				a[k]=left[i];
				k++;
				i++;
			}else {
				a[k]=right[j];
				k++;
				j++;
			}
		}
		if(i<ll) {
			while(i<ll) {
				a[k]=left[i];
				k++;
				i++;
			}
		}
		if(j<rl) {
			while(j<rl) {
				a[k]=right[j];
				k++;
				j++;
			}
		}
		System.out.println("sorted array :" +Arrays.toString(a));
		return a;
	}
	
}
