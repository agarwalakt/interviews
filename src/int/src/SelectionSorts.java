import java.util.Arrays;

public class SelectionSorts {

    public static int[] selectionSort(int[] input) {
        int temp = 0;
        int len = input.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (input[i] < input[j]) {
                    System.out.println(i + " " + j);
                } else {
                    temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
        return input;
    }
}
