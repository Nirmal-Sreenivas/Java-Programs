package com.loops;

public class TriangleNumber8 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        for (i = n; i >= 1; i--) {
            for (j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
