class Node {
    int data;
    Node next;
    Node() {}
    Node(int d, Node next) {
        data = d;
        this.next = next;
    }
    Node(int d) {
        data = d;
        this.next = null;
    }
}

public class LinkedListCreation {

    // Count the number of nodes in the loop
    private static int lengthOfLoop(Node head) {
        if (head == null || head.next == null) return 0;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return countLoopNodes(slow);
        }
        return 0; // no cycle
    }

    private static int countLoopNodes(Node node) {
        int count = 1;
        Node curr = node.next;
        while (curr != node) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Find the beginning of node where cycle starts
    private static Node detectCycle(Node head) {
        if (head == null || head.next == null) return null;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // fixed
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // Detecting loop in a linked list
    private static boolean checkLoop(Node head) {
        if (head == null || head.next == null) return false;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // Reverse the linked list (recursive)
    private static Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Find middle node
    private static Node middleNode(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Search for a key in linked list
    private static boolean search(Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) return true;
            curr = curr.next;
        }
        return false;
    }

    // Delete a node (LeetCode style: you only have access to that node, not head)
    private static void deleteNode(Node node) {
        if (node == null || node.next == null) return;
        node.data = node.next.data;
        node.next = node.next.next;
    }

    // Find length of list
    private static int getLength(Node head) {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Insert at end
    private static Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) return newNode;

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    // Print list
    private static void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" --> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Convert array to list
    private static Node arrayToList(int arr[]) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Helper: create loop at position (1-based index, pos = 0 means no loop)
    private static void createLoop(Node head, int pos) {
        if (pos == 0) return;

        Node loopNode = null, tail = head;
        int idx = 1;
        while (tail.next != null) {
            if (idx == pos) loopNode = tail;
            tail = tail.next;
            idx++;
        }
        if (loopNode != null) {
            tail.next = loopNode;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};

        // Convert array to linked list
        Node head = arrayToList(arr);
        System.out.print("Original List: ");
        printList(head);

        // Insert at end
        head = insertAtEnd(head, 6);
        System.out.print("After insertion: ");
        printList(head);

        // Delete node with value 4
        Node curr = head;
        while (curr != null && curr.data != 4) {
            curr = curr.next;
        }
        if (curr != null) deleteNode(curr);
        System.out.print("After deletion of node 4: ");
        printList(head);

        // Length of list
        System.out.println("Length of the list: " + getLength(head));

        // Search element
        System.out.println("Is 3 present in list: " + search(head, 3));

        // Middle node
        Node midNode = middleNode(head);
        System.out.println("Middle node of the list: " + midNode.data);

        // Reverse
        Node rev = reverse(head);
        System.out.print("Reversed list: ");
        printList(rev);

        // Create loop at position 2 (node with value 5 after reversal)
        createLoop(rev, 2);

        // Check loop
        System.out.println("Is loop present: " + checkLoop(rev));

        // Detect cycle start
        Node cycleStart = detectCycle(rev);
        System.out.println("Node where loop starts: " + (cycleStart != null ? cycleStart.data : "No loop"));

        // Loop length
        System.out.println("No. of nodes in the loop: " + lengthOfLoop(rev));
    }
}
