package com.stack_implimentation;

public class LinkedListArray {
    private Node[] listArray;
    private int head;
    private int size;
    private int capacity;

    private class Node {
        int data;
        int next;

        Node(int data, int next) {
            this.data = data;
            this.next = next;
        }
    }

    public LinkedListArray(int capacity) {
        this.capacity = capacity;
        this.listArray = new Node[capacity];

        // Initialize the list with empty nodes
        for (int i = 0; i < capacity; i++) {
            listArray[i] = new Node(0, i + 1);
        }

        // Set the last node's next to -1 to indicate the end of the list
        listArray[capacity - 1].next = -1;

        this.head = 0;
        this.size = 0;
    }

    public void insert(int data) {
        if (size >= capacity) {
            throw new IndexOutOfBoundsException("Linked list is full");
        }

        int currentIndex = head;
        while (listArray[currentIndex].next != -1) {
            currentIndex = listArray[currentIndex].next;
        }

        int newIndex = listArray[currentIndex].next;
        listArray[currentIndex].next = newIndex;
        listArray[newIndex].data = data;

        size++;
    }

    public void display() {
        int currentIndex = head;
        while (currentIndex != -1) {
            System.out.print(listArray[currentIndex].data + " ");
            currentIndex = listArray[currentIndex].next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListArray linkedList = new LinkedListArray(5);

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        linkedList.display(); // Output: 1 2 3
    }
}
