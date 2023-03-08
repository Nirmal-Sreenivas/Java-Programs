package com.loops;

public class TriangleNumber3 {
    public static void main(String[] args) {
        int n=5;
        int i;
        int j;
        for(i=1; i<=n; i++){
            for(j=i; j<=n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
