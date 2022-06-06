package SinglyLinkedList;

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
        System.out.println("null");
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

    //reverse the singly linked list
    public ListNode Reverse(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    //find middle node in singly linked list


    public ListNode findMiddle() {
        if (head == null){
            return null;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }



    public static void main(String[] args) {


//        ListNode head = new ListNode(10);
//        ListNode second = new ListNode(12);
//        ListNode third = new ListNode(14);
//        ListNode fourth = new ListNode(16);
//
//        head.next = second;
//        second.next = third;
//        third.next = fourth;

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.Beginning(11);
        sll.Beginning(1);
        sll.Beginning(8);
        sll.Beginning(10);

        sll.display();

        //sll.Beginning(8);
        //sll.End(18);
        //sll.Insert(22,3);
        //sll.display();

//        if(sll.Search(head, 8)){
//            System.out.println("Search key Found");
//        }else {
//            System.out.println("Search ket not Found");
//        }

//        ListNode reverseListHead = sll.Reverse(head);
//        sll.display(reverseListHead);

        ListNode middleNode = sll.findMiddle();
        System.out.println("middle node is -> " + middleNode.data);


    }
}
