package com.linkedlist;

public class UC8 {
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

    public int insertAfter(int data) {
        Node node = new Node(data);
        int flag = 0;
        Node temp = head;
        Node prev = head;
        while (temp != null) {
            prev = temp;
            temp = temp.next;
            if (prev.data == 30) {
                prev.next = node;
                node.next = temp;
                flag = 1;
                break;
            }

        }
        return flag;
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
