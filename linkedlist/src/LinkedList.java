public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    // Constructor for making a new node
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

//    public void removeLast(){
//        if(length == 0)
//            System.out.println("List is empty");
//        else if(length == 1){
//            head = null;
//            tail = null;
//            length = 0;
//            System.out.println("Only one element and now that is deleted so now list is empty.");
//        } else {
//            Node temp = head;
//            while (temp.next.next != null){
//                temp = temp.next;
//            }
//            tail = temp;
//            tail.next = null;
//            length --;
//        }
//    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node preTemp = head;
        while (temp.next != null){
            preTemp = temp;
            temp = temp.next;
        }
        tail = preTemp;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

//    Node newNode = new Node(value);
//        if(length == 0){
//        tail = newNode;
//    } else {
//        newNode.next = head;
//    }
//    head = newNode;
//    length++;
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

//    public Node removeFirst(){
//        Node temp = head;
//        if(length == 0) return null;
//        else if(length == 1){
//            head = null;
//            tail = null;
//            length--;
//        } else {
//            head = head.next;
//            temp.next = null;
//            length--;
//        }
//        return temp;
//    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }
}
