import java.util.*;

class Node{

    int val;
    Node next;
    Node(){}
    Node(int val) { 
        this.val = val;
    }
    Node(int val, Node next) {
       this.val = val;
       this.next = next;
    }
}
public class RemoveNthNodeLL {
    
    private static Node deleteMiddleNode(Node head){
        if(head == null || head.next == null) return null;

        Node slow = head, fast =head, prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next =  slow.next;
        return head;
    }
    private static Node removeNthEnd(Node head,int n){
        Node ptr = new Node(0);
        ptr.next = head;
        Node first = ptr, second = ptr;
        for(int i=0;i<=n;i++){
           first = first.next;
        }

        while(first != null){
             first = first.next;
             second = second.next;
        }
        second.next = second.next.next;

        return ptr.next;
    }
    private static void printList(Node head){
        if(head == null || head.next == null){
            System.out.println("Empty List");
            return;
        }

        Node curr = head;
        while(curr != null){
            System.out.print(curr.val);
            if(curr.next != null) System.out.print("-->");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        List<Node> list = new LinkedList<>();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));

        for (int i = 0; i < list.size() - 1; i++) {
          list.get(i).next = list.get(i + 1);
        }
        Node head = list.get(0);
        int n=2;
        
        System.out.print("After removing " + n + "th node from the end in LL : ");
        Node data = removeNthEnd(head, n);
        printList(data);
        System.out.println("Deleting middle node from the LL : ");
        Node middNode = deleteMiddleNode(data);
        printList(middNode);
        
    }
}
