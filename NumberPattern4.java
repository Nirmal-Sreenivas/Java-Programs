package com.loops;
import java.util.Scanner;
public class NumberPattern4 {
    public static void main(String[] args){
        int n = 5;
        int i;
        int j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++){
                if(i==n||j==n||i==1||j==1)
                    System.out.print("1");
                else
                    System.out.print("0");
                }
            System.out.println();
        }

    }
}
