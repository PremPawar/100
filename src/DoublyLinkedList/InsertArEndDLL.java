package DoublyLinkedList;

import org.w3c.dom.ls.LSException;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.List;

public class InsertArEndDLL {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        private ListNode(int data){
            this.data = data;
        }
    }

    public InsertArEndDLL(){
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

     public void printInForwardDirectionI(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
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

     public static void main(String[] args){
        InsertArEndDLL dll = new InsertArEndDLL();

        dll.insertAtEnd(10);
        dll.insertAtEnd(15);
        dll.insertAtEnd(20);
        dll.printInForwardDirectionI();

        System.out.println("Length - " + dll.length());


     }
}
