package com.linkedlist;

public class UC9 {
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
        return flag;
    }

    public void insertAfter(int data) {
        Node node = new Node(data);
        Node temp = head;
        Node prev = head;
        while (temp != null) {
            prev = temp;
            temp = temp.next;
            if (prev.data == 30) {
                prev.next = node;
                node.next = temp;
                break;
            }

        }
    }

    int delete=0;
    // delete data in between
    public int deleteAfter(int data) {
        int result=search(data);
        if(result==1) {
            Node temp = head;
            Node prev = head;
            Node nextNode = head;

            while (temp != null) {
                prev = temp;
                temp = temp.next;

                if (temp.data == 40) {
                    nextNode=temp.next;
                    prev.next=nextNode;
                    delete=1;
                    break;
                }

            }

        }
        return delete;
    }

    public int size() {
        Node temp=head;
        int counter=0;
        while(temp!=null) {
            counter++;
            temp=temp.next;
        }
        System.out.println("size of list is : "+counter);
        return counter;
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
