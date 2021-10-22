package com.linkedlist;

public class UC5 {
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

    public void deleteHead() {
        Node temp=head;
        if(temp!=null) {
            head=temp.next;
        }
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
