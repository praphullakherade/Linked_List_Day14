package com.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        UC4 uc4 = new UC4();
        uc4.append(56);
        uc4.append(70);
        System.out.println("Linked list");
        uc4.print();

        uc4.insertInBetween(30);
        System.out.println("After inserting 30 in between ");
        uc4.print();

    }
}

