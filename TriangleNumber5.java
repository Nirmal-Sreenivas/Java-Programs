package com.loops;

public class TriangleNumber5 {
    public static void main(String[] args) {
        int n=5;
        int i;
        int j;
        for(i=1; i<=n; i++){
            for(j=i; j<=n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
