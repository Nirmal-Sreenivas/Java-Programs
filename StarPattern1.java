package com.loops;

public class StarPattern1 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        int k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}