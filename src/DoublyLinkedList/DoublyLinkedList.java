package DoublyLinkedList;

import com.sun.org.apache.xerces.internal.util.SymbolTable;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }


    //check weather linkt is empty or not
    public boolean isEmpty(){
        return length == 0;
    }
    
    public int length(){
        return length;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public void printForwardDirection(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackwardDirection(){
        ListNode temp = tail;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(3);
        dll.insertLast(7);
        dll.insertLast(9);
        dll.insertLast(5);

        dll.printForwardDirection();
        dll.printBackwardDirection();
    }
}
