import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Maincopy {

	public static void mains(String[] args) {
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
	
	
	
	
	
	
	
	
	public List<Integer> preOrderTraversal(TreeNode root){
		List<Integer> lt = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		TreeNode node =root;
		st.push(root);
		while(st.empty()==false) {
			node =st.peek();
			lt.add(node.val);
			st.pop();
			if(node.right!=null) {
				st.push(node.right);
			}
			if(node.left!=null) {
				st.push(node.left);
			}
			
		}
		return lt;
		
	}

	
	public static int factorial(int num) {
		int factorial=1;
		if(num==0) {
			return 0;
		}
		if (num==1) {
			return 1;
		}
		for (int i=num; i>1;i--) {
			factorial= factorial*i;
		}
		return factorial;
	}
	public void test() {
		
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
		       
		        }
   
		    
	public static void test2() {

		     //   Sample code to perform I/O:
		       //  * Use either of these methods for input

		        //BufferedReader
		       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        //String name = br.readLine();                // Reading input from STDIN
		        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

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

	public void tet3() {
		//Scanner
        //Scanner s = new Scanner(System.in);
        String name = "fnjzxnxnjplfwzowfdrhrvhegkmoncbkembjoudteqchjwqfzlofyflkmxnooasxulwofjzknthqqxgshvwxdvhdnlzjzdjdiifg";                 // Reading input from STDIN
        
        int len = name.length();
        int j=len-1;
        char[] arr = name.toCharArray();
        for(int i=0; i<j; i++){
             if(i>j){
                System.out.print("NO");
                break;
            }
            if(arr[i]==arr[j]){
                j--;
                if(i+1==j || i==j) {
                	System.out.print("YES");	
                }
                
            }else {
                System.out.print("NO");
                break;
            }
        }
	}
}
	


