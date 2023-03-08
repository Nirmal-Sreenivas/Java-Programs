package com.loops;

public class TriangleNumber4 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <=i; j++) {
                System.out.print(6-i);
            }
            System.out.println();
        }
    }
}