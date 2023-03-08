package com.loops;

public class TriangleNumber2 {
    public static void main(String[] args) {
        int n=5;
        int i;
        int j;
        for(i=n; i>=1; i--) {
            for(j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
