package top.yxtong.java.basic.operation;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three points for a triangle:");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double x3=input.nextDouble();
        double y3=input.nextDouble();
        double num1=Math.pow(x1-x2,2);
        double num2=Math.pow(y1-y2,2);
        double num3=Math.pow(x1-x3,2);
        double num4=Math.pow(y1-y3,2);
        double num5=Math.pow(x2-x3,2);
        double num6=Math.pow(y2-y3,2);
        double b1=Math.pow(num1+num2,0.5);
        double b2=Math.pow(num3+num4,0.5);
        double b3=Math.pow(num5+num6,0.5);
        double s=(b1+b2+b3)/2;
        double area=Math.pow(s*(s-b1)*(s-b2)*(s-b3),0.5);
        System.out.println("The area of the triangle is"+area);

    }
}
