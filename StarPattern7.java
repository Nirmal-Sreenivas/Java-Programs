package com.loops;

public class StarPattern7 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = i*2; j < n*2; j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(j=i*2;j<n*2;j++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
