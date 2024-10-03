public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;// print size linked list
    // Add in first ll

    public void addFirst(int data) {

        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 = newNode next = head
        newNode.next = head; // link

        // step3 = head = newNode
        head = newNode;
    }

    // Add in last ll
    public void addLast(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = null;
            return;
        }
        // step2 = newNode next = head
        tail.next = newNode;
        tail = newNode;
    }

    // Add in the Middle of LL
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print Function
    public static void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println();
    }

// To remove first linked List

public int removeFrist(){
    if(size ==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail= null;
        size =0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
}

//To remove last data linkedList
public int removeLast(){
    if(size ==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size ==1){
        int val = head.data;
        head=tail=null;
        size =0;
        return val;
    }
    //prev : i= size-2
    Node prev = head;
    for(int i=0;i<size-2; i++){
        prev.next = null;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size --;
    return val;
}
//iterative Search
public int itrSearch(int key){
    Node temp = head;
    int i = 0;

    while(temp != null){
        if(temp.data==key){
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
}
// To recursive search 
public int helper(Node head, int key){
    if(head == null){
        return -1;
    }
    if(head.data == key){
        return 0;
    }
    int idx = helper(head.next, key);
    if(idx ==-1){
        return -1;
    }
    return idx+1;
}
public int recSearch(int key){
    return helper(head, key);
}
// reverse a linked list
public void reverse(){
    Node prev = null; 
    Node curr = tail =head;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = curr;
        prev = curr;
        curr=curr;
    }
    head = prev;
}
// find and remove Nth Node from 
public void deleteNthformEnd(int n){
    int sz =0;
    Node temp = head;
    while(temp != null){
        temp = temp.next;
        sz++;
    }
    if(n == sz){
        head = head.next; //removeFirst 
        return;
    }
    //sz-n
    int i =1;
    int iToFind =sz-n;
    Node prev = head;
    while(i< iToFind){
        prev = prev.next;
        i++;
    }
    prev.next= prev.next.next;
    return;


}
//slow -fast approach 
public Node findMid(Node head){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next; //+1
        fast = fast.next.next; //+2
    }
    return slow; // slow is my midNode 
}
public boolean checkPlindrome(){
    if(head == null || head.next == null){
        return true;
    }
    //step1 = find mid
    Node midNode= findMid(head);
    //step - reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr=next;
    }
    Node right = prev; // right half head
    Node left = head;

    //step3 - check left half & right half
    while (right != null) {
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}

//Detecting Cycle in LL 

public static boolean isCycle(){
    Node slow = head;
    Node fast = head; 
    while (fast != null && fast.next !=null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
    }
    return false;
}

    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());
    //     LinkedList ll = new LinkedList();
    //     ll.addFirst(1);
    //     ll.addFirst(2);
    //     ll.addFirst(2);
    //     ll.addFirst(1);
    //     print();
     
    //    System.out.println(ll.checkPlindrome());

    }
}
