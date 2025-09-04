class Node{
    int data;
    Node prev;
    Node next;
    Node(int d){
        data = d;
        prev = null;
        next = null;
    }
}

public class DoublyLinkedList {

    //reversing the DLL
    private static Node reverseDLL(Node head){
        Node curr =head, temp = null;

        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp != null){
            head = temp.prev;
        }
        return head;
    }

    //deleting a node
    private static Node delPos(Node head , int x){
        //here x is position
        if(head == null) return null;

        Node curr = head;
        int count =1;
        while(curr != null && count < x){
            curr = curr.next;
            count++;
        }

        if(curr == null) return head;

        if(curr == head){
            head = head.next;
            if(head != null) head.prev = null;
            return head;
        }

        if(curr.prev != null){
            curr.prev.next = curr.next;
        }

        if(curr.next != null){
            curr.next.prev = curr.prev;
        }
        return head;
    }

    //insertion at DLL
    private static Node insertAtPos(Node head, int x, int p){
        //x - value p- position of element
        Node newNode = new Node(x);

        //check for empty -
        if(head == null) return newNode;

        Node curr = head;
        int count =0;
        
        while(curr != null &&count < p){
            curr = curr.next;
            count++;
        }

        if(curr == null) return head;

        newNode.next = curr.next;
        newNode.prev = curr;

        if(curr.next != null) curr.next.prev = newNode;

        curr.next = newNode;

        return head;

    }
    //printing the double linked list
    private static  void printDLL(Node head){
        if(head == null) System.out.println("DLL is empty");;

        

        while(head != null){
            System.out.print(head.data);
            if(head.next != null) System.out.print(" <--> ");
            head = head.next;
        }
        System.out.println();

    }
    
    //converting the array into doubly linkedlist
    private static  Node constructDLL(int arr[]){
        if(arr.length  == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for(int i=1;i<arr.length;i++){
          Node newNode = new Node(arr[i]);
          curr.next = newNode;
          newNode.prev = curr;
          curr  = newNode;
        }

        return head;
    }
    public static void main(String[] args) {
    
        int arr[] = {1,2,3,4,5};

        Node head = constructDLL(arr);
        int x=6, p =3;


        System.out.println("Doubly linked list : " );
        printDLL(head);

        Node newNode = insertAtPos(head, x, p);
        System.out.println("After insertion of node at given pos : " );
        printDLL(newNode);
        System.out.println("After deleting the node : ");
        int y = 3;
        Node delNode = delPos(head, y);
        printDLL(delNode);
        System.out.println("Printing the reverse of DLL: ");
        Node rev = reverseDLL(head);
        printDLL(rev);

    }
}
