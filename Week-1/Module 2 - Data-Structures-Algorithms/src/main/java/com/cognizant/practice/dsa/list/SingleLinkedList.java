package com.cognizant.practice.dsa.list;

public class SingleLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = node;
    }

    public void delete(int key) {
        if (head == null) return;
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node t = head;
        while (t.next != null && t.next.data != key) t = t.next;
        if (t.next != null) t.next = t.next.next;
    }

    public boolean search(int key) {
        Node t = head;
        while (t != null) {
            if (t.data == key) return true;
            t = t.next;
        }
        return false;
    }

    public void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }
}
