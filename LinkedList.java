package com.linkedlist;

public class LinkedList {
    public static void main(String[] args) {

        Node node1 = new Node(56);
        Node node2 = new Node(70);
        Node node3 = new Node(30);

        Node head = node1;
        node1.next = node2;
        node2.next = node3;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

