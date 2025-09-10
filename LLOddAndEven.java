
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
public class LLOddAndEven {
    
    private static Node oddEvenList(Node head){
        if(head == null || head.next == null) return head;

        Node odd = head, even = head.next , evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next= odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
    private static void printList(Node head){
        if(head == null ) {
            System.out.println(" Empty List ");
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

        System.out.print("Segregated odd and even linked list : ");
        Node newHead = oddEvenList(head);
        printList(newHead);
    }
}
