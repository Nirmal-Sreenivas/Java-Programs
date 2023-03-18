package com.loops;

public class StarPattern4 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<i;j++) {
                System.out.print(" ");
            }
            for(j=1;j<=n*2-(2*i-1);j++){
                if(i==1||j==1||j==n*2-(2*i-1)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

