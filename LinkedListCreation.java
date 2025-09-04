class Node{
    int data;
    Node next;
    Node (){}
    Node (int d, Node next){
        data = d;
        this.next = next;
    }
    Node( int d){
        data  =d;
    }
}

public class LinkedListCreation {


    //calculating the middle of linked list
    //using two pointer approach
    private static Node middleNode(Node head){
        Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    //search in a linked list
    private static boolean search(Node head, int key){
        if(head == null) return false;  // list is empty

        Node curr = head;

        while(curr != null){
            if(curr.data == key) return true;
            curr = curr.next;
        }

        return false; // if key is not matced
        
    }


    /* problem statement -There is a singly-linked list head and we want to delete a node node in it.
    You are given the node to be deleted node. You will not be given access to the first node of head.
    All the values of the linked list are unique, 
    and it is guaranteed that the given node node is not the last node in the linked list.
 */

   private static void deleteNode(Node node){
           node.data = node.next.data;
           node.next = node.next.next;
   }

   //find the length of list
   private static int getLength(Node head){
        if(head == null) return 0;

        int count =1;
        Node curr = head;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        return count;
   }

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
         
         //to delete the node
         Node curr = head;
        while ( curr.next != null && curr.data != 4){
            curr = curr.next;
        }
        
        //delete the node pointing to 5
        if(curr.next != null){
            deleteNode(curr);
        }

        System.out.println("After deletion of node 4 : " );
        printList(head);

        System.out.println("Length of the list : " + getLength(head));

        System.out.println("Is given element present in list : " + search(head,3));

        System.out.println("Middle node of the given list : "); 
        Node middNode = middleNode(head);
        printList(middNode);

              

    }
}
