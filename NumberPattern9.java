package com.loops;

public class NumberPattern9 {
    public static void main(String[] args){
        int n = 5;
        int i;
        int j;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i == j || (j == (n+1) - i))
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }


}
