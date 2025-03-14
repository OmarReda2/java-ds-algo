package datastructures.doublyLinkedlist.impl;

public class DoublyLinkedList {

    class Node {
        int value;
        Node next;
        Node prev;

        Node (int value){this.value = value;}
    }

    private  Node head;
    private  Node tail;
    private  int length;

    DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void getHead(){
        System.out.println("head.value = "+ head.value);
    }

    public void getTail(){
        System.out.println("tail.value = "+ tail.value);
    }

    public void getLength(){
        System.out.println("Length = "+ length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }


    public Node removeLast(){
        if (length == 0) return null;
        Node temp = tail;

        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }


    public Node removeFirst(){

        if(length ==0) return  null;
        Node temp = head;
        if (length==1){
            head = null;
            tail = null;

        }else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return  temp;
    }

    public Node get(int index){
        if(index < 0 || index > length) return null;

        Node temp;
        if(index < length/2){
            temp = head;
            for(int i =0 ; i < index ; i++){
                 temp = temp.next;
//                System.out.println(temp.value);
            }
        }else{
            temp = tail;
            for (int i = length-1; i > index ; i--) {
                temp = temp.prev;
//                System.out.println(temp.value);

            }
        }
        return  temp;
    }

    public boolean set(int index, int value){
//        if(index < 0 || index > length-1) return false;


        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }


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
        Node after = get(index);
        Node before = after.prev;

        newNode.prev = before;
        newNode.next = after;

        before.next = newNode;
        after.prev = newNode;

        length++;

        return true;
    }


    public Node remove(int index){
        if(index < 0 || index > length) return null;
        if(index == 0) removeFirst();
        if(index == length) removeLast();


        
        Node temp = get(index);
        Node before = temp.prev;
        Node after = temp.next;

        after.prev = before;
        before.next = after;

        temp.next = null;
        temp.prev = null;


        /*
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        temp.next = null;
        temp.prev = null;
         */

        length--;
        return temp;
    }
}

