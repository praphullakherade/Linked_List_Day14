package com.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        UC6 uc6 = new UC6();
        uc6.append(56);
        uc6.append(30);
        uc6.append(70);
        System.out.println("Linked list");
        uc6.print();

        uc6.deleteLast();
        System.out.println("After inserting 30 in between ");
        uc6.print();

    }
}

