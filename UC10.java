package com.linkedlist;

public class UC10 {
    Node head;
    Node tail;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
    }

    public void sortList() {

        Node current = head, index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
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
