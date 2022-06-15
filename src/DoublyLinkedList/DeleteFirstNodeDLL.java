package DoublyLinkedList;

import java.util.NoSuchElementException;

public class DeleteFirstNodeDLL {
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

    public DeleteFirstNodeDLL() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void printFromForwardDirection(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
    }


    public static void main(String[] args){
        DeleteFirstNodeDLL dll = new DeleteFirstNodeDLL();

        dll.insertAtEnd(10);
        dll.insertAtEnd(13);
        dll.insertAtEnd(8);
        dll.insertAtEnd(11);
        dll.insertAtEnd(15);
        dll.printFromForwardDirection();

        dll.deleteFirst();
        dll.printFromForwardDirection();

    }
}
