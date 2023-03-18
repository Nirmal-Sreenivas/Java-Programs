package com.loops;

public class StarPattern9 {
    public static void main(String[] args) {
        int n = 10;
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j||i+j==n+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
