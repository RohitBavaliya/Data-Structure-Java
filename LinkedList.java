
public class LinkedList {
    // head of the linked list
    Node head;
    static class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void printList()
    {
        Node n = head;
        while(n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    // Insert new Node in front
    public void push(int newData)
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Insert New Node After Any Other Node
    public void insertNode(int newData,Node prevNode)
    {
        if(prevNode == null)
        {
            System.out.println("The Given Previous node can not be null");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;    // connect new node with prevNode
        prevNode.next = newNode;   // set prevNode as newNode
    }

    // append newNode at end of LinkedList
    public void append(int newData)
    {
        Node newNode = new Node(newData);  // Create new Node and insert Data

        if(head == null)
        {
            head = new Node(newData);
            return;
        }

        newNode.next = null;
        
        Node last = head; // define first last node as head and traverse from end of LinkedList

        while (last.next!=null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.head = new Node(2);         // head node
        Node second = new Node(4);      // second node
        Node third = new Node(5);       // third node

        obj.head.next = second;         // connect to second
        second.next = third;            // connect to third


        // add new node at front
        obj.push(1);
        obj.insertNode(3, obj.head.next);
        obj.append(6);
        obj.printList();                // print linked list
        
    }
}
