package DoublyLinkedList;

import java.util.NoSuchElementException;

public class DeleteLastNodeDLL {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private ListNode next;
        private ListNode previous;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DeleteLastNodeDLL() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean IsEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void printFromBeginning(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(IsEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public ListNode deleteLastNode(){
        if(IsEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail){
            head = null;
        }else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous =null;
        length--;
        return temp;

    }

    public static void main(String[] args){
        DeleteLastNodeDLL dll = new DeleteLastNodeDLL();

        dll.insertAtEnd(10);
        dll.insertAtEnd(9);
        dll.insertAtEnd(13);
        dll.insertAtEnd(5);
        dll.insertAtEnd(6);

        dll.printFromBeginning();
        System.out.println("length - " + dll.length());

        dll.deleteLastNode();
        dll.printFromBeginning();
        System.out.println("length - " + dll.length());

    }
}

