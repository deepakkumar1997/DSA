public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(3);
//        linkedList.append(4);
//        linkedList.append(5);
//        linkedList.append(6);

        System.out.println("Last deleted node: "+linkedList.removeLast().value);
//        System.out.println("Last deleted node: "+linkedList.removeLast().value);
//        System.out.println("Last deleted node: "+linkedList.removeLast().value);
//        System.out.println("Last deleted node: "+linkedList.removeLast().value);
//        System.out.println("Last deleted node: "+linkedList.removeLast());

//        linkedList.prepend(2);
//        linkedList.prepend(1);
//        linkedList.append(7);

//        System.out.println("Deleted first element: "+linkedList.removeFirst().value);
//        System.out.println("Deleted first element: "+linkedList.removeFirst().value);
//        System.out.println("Deleted first element: "+linkedList.removeFirst().value);
//        System.out.println("Deleted first element: "+linkedList.removeFirst());

//        System.out.println("Element at index-0: "+linkedList.get(0).value);
//        System.out.println("Element at index-6: "+linkedList.get(6).value);
//        System.out.println("Element at index-7: "+linkedList.get(7));
//        System.out.println("Element at index-8: "+linkedList.get(8));

        // set or add a node at a particular index
//        System.out.println(linkedList.insert(1,1)); //return false as list is empty as of now
        System.out.println(linkedList.insert(0,0));
        System.out.println(linkedList.insert(1,2));
        System.out.println(linkedList.insert(2,44));
        System.out.println(linkedList.insert(1,11));
        System.out.println(linkedList.insert(3,3));
        System.out.println(linkedList.insert(1,1));

        //setting/updating value at particular index
//        System.out.println(linkedList.set(0, 0));
//        System.out.println(linkedList.set(8, 8));
//        System.out.println(linkedList.set(6, 6));

        // remove a node at a particular index
//        System.out.println(linkedList.remove(0));
//        System.out.println(linkedList.remove(-1));
//        System.out.println(linkedList.remove(5));
//        System.out.println(linkedList.remove(4));
//        System.out.println(linkedList.remove(1));

//        System.out.println("Head: " + linkedList.getHead().value);
//        System.out.println("Tail: " + linkedList.getTail().value);
        System.out.println("Length: " + linkedList.getLength());
        System.out.print("List: ");
        linkedList.printList();
    }
}