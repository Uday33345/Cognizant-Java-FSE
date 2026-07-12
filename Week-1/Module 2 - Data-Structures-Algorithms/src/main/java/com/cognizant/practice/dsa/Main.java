package com.cognizant.practice.dsa;

import com.cognizant.practice.dsa.search.SearchAlgorithms;
import com.cognizant.practice.dsa.sort.SortAlgorithms;
import com.cognizant.practice.dsa.list.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9, 2};

        SearchAlgorithms sa = new SearchAlgorithms();
        System.out.println("Linear Search 8: index " + sa.linearSearch(arr, 8));

        int[] sorted = {1, 3, 5, 7, 9, 11};
        System.out.println("Binary Search 7: index " + sa.binarySearch(sorted, 7));

        SortAlgorithms sort = new SortAlgorithms();
        int[] a = {5, 3, 8, 1};
        sort.bubbleSort(a);
        System.out.print("Bubble Sort: ");
        for (int x : a) System.out.print(x + " ");
        System.out.println();

        int[] b = {10, 7, 8, 9, 1};
        sort.quickSort(b, 0, b.length - 1);
        System.out.print("Quick Sort: ");
        for (int x : b) System.out.print(x + " ");
        System.out.println();

        int[] c = {6, 2, 4, 1, 3};
        sort.mergeSort(c, 0, c.length - 1);
        System.out.print("Merge Sort: ");
        for (int x : c) System.out.print(x + " ");
        System.out.println();

        SingleLinkedList list = new SingleLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        System.out.println("Search 20: " + list.search(20));
        list.delete(20);
        list.display();
    }
}
