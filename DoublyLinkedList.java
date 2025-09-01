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


        System.out.println("Doubly linked list : " );
        printDLL(head);

    }
}
