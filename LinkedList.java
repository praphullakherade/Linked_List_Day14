package com.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
            UC8 uc8 = new UC8();
            uc8.push(56);
            uc8.push(30);
            uc8.push(70);
            System.out.println("Linked list");
            uc8.print();

            uc8.insertAfter(40);
            System.out.println("After inserting ");
            uc8.print();
    }
}

