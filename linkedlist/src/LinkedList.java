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
            System.out.print(temp.value+" ");
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

    // get a node at particular index
//    public Node get(int index){
//        if(length == 0) return null;
//        Node temp = head;
//        for(int i=0; i < index; ++i){
//            temp = temp.next;
//        }
//        return temp;
//    }

    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; ++i){
            temp = temp.next;
        }
        return temp;
    }

    // updating/setting value at particular index
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    // inserting/adding value at a particular index
//    public boolean insert(int index, int value){
//        Node newNode = new Node(value);
//        if (index > 0 && length == 0 || index < 0 || index > length) return false;
//        else if(index == 0 && length == 0){
//            head = newNode;
//            tail = newNode;
//            length++;
//        } else if (index == 0) {
//            prepend(value);
//        } else if (index == length) {
//            append(value);
//        } else {
//            Node temp = head;
//            Node preTemp = head;
//            for(int i=0; i < index; ++i){
//                preTemp = temp;
//                temp = temp.next;
//            }
//            preTemp.next = newNode;
//            newNode.next = temp;
//            length++;
//        }
//        return true;
//    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

//    public boolean remove(int index){
//        if(index < 0 || index >= length) return false;
//        if(index == 0){
//            removeFirst();
//            return true;
//        }
//        if(index == length-1){
//            removeLast();
//            return true;
//        }
//        Node temp = get(index-1);
//        Node postTemp = get(index);
//        temp.next = postTemp.next;
//        postTemp.next = null;
//        length--;
//        return true;
//    }
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    // reverse the linked list
    public void reverseList(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0; i < length; ++i){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
