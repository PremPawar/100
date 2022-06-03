package SinglyLinkedList;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.List;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    //Display the LinkedList
    public void display() {
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    //Add new node at the beginning of the linked list
    public void Beginning(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //Add new node at end of the linked list
    public void End(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    //add new node at given position in linked list
    public void Insert(int value, int position){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }
        ListNode previous = head;
        int count = 1;
        while (count < position -1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        node.next = current;
        previous.next = node;
    }

    //Search Element in Singly linked list
    public boolean Search(ListNode head, int valueToSearch) {
        if(head == null){
            return false;
        }
        ListNode curr = head;
        while(curr != null){
            if(curr.data == valueToSearch){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(14);
        ListNode fourth = new ListNode(16);

        head.next = second;
        second.next = third;
        third.next = fourth;

        //sll.display();

        //sll.Beginning(8);
        //sll.End(18);
        //sll.Insert(22,3);
        //sll.display();

        if(sll.Search(head, 8)){
            System.out.println("Search key Found");
        }else {
            System.out.println("Search ket not Found");
        }


    }
}
