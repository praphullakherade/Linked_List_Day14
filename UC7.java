package com.linkedlist;

public class UC7 {
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

    public int search(int data) {
        Node temp = head;
        int flag = 0;
        while (temp != null) {
            if (temp.data == data) {
                flag = 1;
                break;
            }
            temp = temp.next;
        }
        if (flag == 1) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
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
