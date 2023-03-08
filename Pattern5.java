package com.loops;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        for(i=n;i>0;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
