package com.loops;

public class StarPattern2 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        int k;
        for(i=1;i<=n;i++){
            for(j=i;j<n;j++) {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                if(k==1||k==2*i-1||i==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

