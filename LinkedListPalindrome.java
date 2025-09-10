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
public class LinkedListPalindrome {
    
    private static boolean  isPalindrome(Node head){
        Node slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node first = head;
        Node second = reverseList(slow);

        while(second != null){
            if(first.val != second.val) return false;
            first= first.next;
            second = second.next;
        }
        reverseList(second);
        return true;
    }

    private static  Node reverseList(Node node){
        Node prev = null, curr = node;
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        
        List<Node> list = new LinkedList<>();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(2));
        list.add(new Node(3));

        for (int i = 0; i < list.size() - 1; i++) {
          list.get(i).next = list.get(i + 1);
        }
        Node head = list.get(0);

        System.out.println("Is the given linked list  palindrome : " +isPalindrome(head));

    }
}
