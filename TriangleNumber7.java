package com.loops;

public class TriangleNumber7 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for (j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
