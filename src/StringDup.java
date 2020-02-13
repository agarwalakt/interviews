import java.util.HashSet;
class Node {
}
public class StringDup {
    class LinkedListNode {
//        Noode n = new Noode();
        int data;
        Noode previous;
        Noode next;
    }



    //string dup in linkedlist
    static void deleteDups(LinkedListNode n){
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;
        while(n!=null){
            if(set.contains(n.data)){
                previous.next= n.next;
            }else {
                set.add(n.data);
                previous=n;
            }
        }
    }
}
