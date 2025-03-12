package datastructures.linkedlist.impl;

public class Main {
    public static void main(String[] args) {

//        // 4.1 EXERCISE-LL-Constructor
//        LinkedList myLinkedList = new LinkedList(4);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        // 6.1 LL-Print List
//        myLinkedList.printList();


//        // 7.1 EXERCISE-LL-Append
//        LinkedList myLinkedList = new LinkedList(1);
//
//        myLinkedList.append(2);
//
//        myLinkedList.printList();


//        // 9.2 SOLUTION-LL-RemoveLast
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());


//        // 10.2 SOLUTION-LL-Prepend
//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(3);
//        myLinkedList.prepend(1);
//
//        myLinkedList.printList();


//        // 11.2 SOLUTION-LL-RemoveFirst
//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(1);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeFirst());


//        // 12.2 SOLUTION-LL-Get
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//
//
//        System.out.println(myLinkedList.get(3).value);



//        // 13.2 SOLUTION-LL-Set
//        LinkedList myLinkedList = new LinkedList(22);
//        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//
//        myLinkedList.set(1, 4);
//        myLinkedList.printList();



//        // 14.2 SOLUTION-LL-Insert
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(2);
//
//        myLinkedList.insert(1, 1);
//        myLinkedList.printList();


//        // 15.2 SOLUTION-LL-Remove
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//
//        System.out.println("the removed item: " + myLinkedList.remove(2).value);;
//        myLinkedList.printList();



        // 16.2 SOLUTION-LL-Reverse
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        myLinkedList.printList();
        System.out.println(" ");

        myLinkedList.reverse();

        myLinkedList.printList();
//        System.out.println(myLinkedList.get(4));


    }
}