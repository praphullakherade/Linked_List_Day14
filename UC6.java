package com.linkedlist;

public class UC6 {
    Node head;
    Node tail;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteLast() {
        Node temp=head;
        Node prev=head;
        while(temp.next!=null) {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
}
