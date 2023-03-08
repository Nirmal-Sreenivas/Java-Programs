package com.loops;

public class NumberPattern15 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        int k;
        for (i = 1; i <= n; i++) {
            for (j = i; j <i+n; j++) {
                for(k=1;;k++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }

}
