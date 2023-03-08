package com.loops;

public class NumberPattern5 {
    public static void main(String[] args){
        int n = 5;
        int i;
        int j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++){
                if(i!=3||j!=3)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }

    }


}
