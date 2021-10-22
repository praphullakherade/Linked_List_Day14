package com.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
            UC10 uc10 = new UC10();
            uc10.push(56);
            uc10.push(30);
            uc10.push(70);
            System.out.println("Linked list");
            uc10.print();

            uc10.sortList();
            System.out.println("After sorting ");
            uc10.print();

    }
}

