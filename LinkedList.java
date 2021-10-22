package com.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
            UC9 uc9 = new UC9();
            uc9.push(56);
            uc9.push(30);
            uc9.push(70);
            System.out.println("Linked list");
            uc9.print();

            uc9.insertAfter(40);
            uc9.print();

            uc9.size();
            uc9.deleteAfter(40);
            System.out.println("After delete ");
            uc9.print();
            uc9.size();
    }
}

