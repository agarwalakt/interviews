import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        char[] arr = ("lodnfdnfd").toCharArray();
        printReverse(arr);
    }



    private static void printReverse(char [] str) {
        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }


}
