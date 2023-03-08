package com.loops;

public class NumberPattern3 {
    public static void main(String[] args){
        int n = 5;
        int i;
        int j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++){
                System.out.print(j%2==0?0:1);
            }
            System.out.println();
        }

    }
}
