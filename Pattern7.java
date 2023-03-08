package com.loops;

public class Pattern7 {
    public static void main(String[] args){
        int n = 5;
        int i;
        int j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++){
                if(i==n||j==n||i==1||j==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
