package com.loops;

public class NumberPattern12 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
