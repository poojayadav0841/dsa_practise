class Node{
    int data;
    Node next;
    Node( int d){
        data  =d;
        next = null;
    }
}

public class LinkedListCreation {


    //inserting the head at end
    private static Node insertAtEnd(Node head, int x){
        
        Node newNode = new Node(x);
        //check for empty list-
        if(head  == null) return newNode;

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
        return head;
        
    }

    //for printing the list
    private static void printList(Node head){
        //check for empty

        if(head == null){
             System.out.println("List is empty");
             return;
        }

        while(head != null){
            System.out.print ( head.data);
            if(head.next != null) System.out.print("-->");
            head = head.next;
        }
        System.out.println();
    }


    //for converting the array to List
    private static Node arrayToList(int arr[]){
           
        //check for empty array
        if(arr.length  == 0) return null;
        
        // intialise  first idx array element as head
        Node head = new Node(arr[0]);
        Node curr = head;

        //now iterate over arrat
        for(int i=1;i<arr.length;i++){
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String args[]){
 
        int arr[] = {1,2,3,4,5};

        /* problem statement -
         * covert the array into linkedlist
         */

         Node head = arrayToList(arr);

         Node end = insertAtEnd(head, 6);

         printList(end);

    }
}
