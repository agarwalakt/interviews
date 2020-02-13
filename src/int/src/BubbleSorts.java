import java.util.Arrays;

public class BubbleSorts {

    //int[] arr = {1, 6, 2, 12, 4, 7};

    public static int[] bub(int[] input){
        int len =input.length;
        int temp=0;
        for(int i=0; i<len; i++){
            for(int j=0; j<len-i-1;j++){
                if(input[j]<input[j+1]){
                }else{
                    temp=input[j+1];
                    input[j+1]=input[j];
                    input[j]=temp;
                }
            }
        }
        return input;

    }
}
