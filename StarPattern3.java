package com.loops;

public class StarPattern3 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        int k;
        for(i=n;i>=1;i--){
            for(j=n;j>i;j--) {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }

            System.out.println();
        }

    }
}

