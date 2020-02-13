import java.util.Arrays;
import java.util.Scanner;


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Maintena {
    public static void main(String args[] ) throws Exception {
    
        }
       
    	
    }
    
    /*
    
    public static void test() {

        Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner	
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        

        // Write your code here
        if(name.length() ==1){
            System.out.print("NO");
        }
        int len = name.length();
        for(int i=0; i<len-1; i++){
            if(name.toCharArray()[i]==name.toCharArray()[len-1]){
                len--;
            }
            else{
                System.out.print("NO");
            }
        }
        System.out.print("YES");
        s.close();
    }
    public void tes(){
    	String name ="acb";
    	String checker= "edc";
        
        char[] a= name.toCharArray();
        char[] b= checker.toCharArray();
        
        int nameLen = name.length();
        int checkerLen= checker.length();
        
        int count=0;
        int j=0;
        for (int i=0; i<nameLen-1; i++){
            for(j=0; j<checkerLen-1; j++){
                if(a[i]!=b[j]){
                count =count+1;
            }    
            }
            
        }
        if(nameLen>=checkerLen){
            System.out.println(count+(nameLen-checkerLen));      
        }else{
            System.out.println(count+(checkerLen-nameLen));      
        }
       
*/

  

