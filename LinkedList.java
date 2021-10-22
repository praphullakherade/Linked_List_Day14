package com.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        UC5 uc5 = new UC5();
        uc5.append(56);
        uc5.append(30);
        uc5.append(70);
        System.out.println("Linked list");
        uc5.print();

        uc5.deleteHead();
        System.out.println("After inserting 30 in between ");
        uc5.print();

    }
}

