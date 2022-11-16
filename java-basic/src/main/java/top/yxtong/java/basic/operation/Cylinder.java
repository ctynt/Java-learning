package top.yxtong.java.basic.operation;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入圆柱体的半径和高:");
        Double r=scan.nextDouble();
        Double h=scan.nextDouble();
        Double space= r*r*Math.PI;
        System.out.println("面积"+space);
        System.out.println("体积"+space*h);
        scan.close();
    }
}

