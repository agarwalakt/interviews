import java.util.HashSet;
class Node {
}
public class StringDup {
    class LinkedListNode {
        Node n = new Node();
        int data;
        Node previous;
        Node next;
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
