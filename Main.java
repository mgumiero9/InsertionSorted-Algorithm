package com.company;

import java.util.Scanner;

public class Main {

    public static void insertIntoSorted(int[] ar) {
        int element = ar[ar.length - 1];
        for (int i = ar.length - 1; i > 0; i--) {
            if (element <  ar[i - 1]) {
                ar[i] = ar[i - 1];
                printArray(ar);
            } else {
                ar[i] = element;
                printArray(ar);
                break;
            }
            if (i == 1) {
                if (element <  ar[0]) {
                    ar[0] = element;
                    printArray(ar);
                }
            }
        }
    }
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }
    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
