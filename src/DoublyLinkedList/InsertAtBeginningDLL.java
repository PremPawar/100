package DoublyLinkedList;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class InsertAtBeginningDLL {
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

    public InsertAtBeginningDLL(){
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

    public void printForwardDirection(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            tail = newNode;
        }else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }


    public static void main(String[] args){
        InsertAtBeginningDLL dll = new InsertAtBeginningDLL();

        dll.insertFirst(10);
        dll.insertFirst(15);
        dll.insertFirst(20);
        dll.printForwardDirection();

        System.out.println("Length - "+ dll.length());

    }
}
