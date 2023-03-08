package com.loops;

public class NumberPattern16 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        int k =1;
        for (i = 1; i <= n; i++) {
            for (j = i; j <i+n; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
