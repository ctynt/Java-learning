package top.yxtong.java.basic.For;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int n = 0,t=0,i=0,k=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        n = sc.nextInt();
        k=n;
        for (i = 0;i < n;i++ ){
            for(int j =k-1 ;j >0 ;j--){
                System.out.print(" ");
            }
            for(t=i+1;t >0;t-- ){
                System.out.print(t);
            }
            for(int p = 1;p<i+1;p++){
                System.out.print(p+1);
            }
            for(int j = k-1;j >0;j --){
                System.out.print(" ");
            }  System.out.println();
            k-=1;

        }

    }
}

