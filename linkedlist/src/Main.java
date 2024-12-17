public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(2);
        linkedList.append(42);
        System.out.println("Last deleted node: "+linkedList.removeLast().value);
        System.out.println("Last deleted node: "+linkedList.removeLast().value);
        System.out.println("Last deleted node: "+linkedList.removeLast().value);
        System.out.println("Last deleted node: "+linkedList.removeLast().value);
        System.out.println("Last deleted node: "+linkedList.removeLast());

        linkedList.prepend(11);
        linkedList.prepend(22);
        linkedList.append(33);
        System.out.println("Deleted first element: "+linkedList.removeFirst().value);
        System.out.println("Deleted first element: "+linkedList.removeFirst().value);
        System.out.println("Deleted first element: "+linkedList.removeFirst().value);
        System.out.println("Deleted first element: "+linkedList.removeFirst());

//        System.out.println("Head: " + linkedList.getHead().value);
//        System.out.println("Tail: " + linkedList.getTail().value);
        System.out.println("Length: " + linkedList.getLength());
        linkedList.printList();


    }
}