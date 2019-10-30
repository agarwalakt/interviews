import java.util.HashMap;

public class fib {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public  int fibo(int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return n;
        }

        if(this.map.containsKey(n)){
            System.out.println("from map : "+ n);
            return this.map.get(n);
        }
        int result = fibo(n-1) + fibo(n-2);
        this.map.put(n, result);
        return result;
    }
}
