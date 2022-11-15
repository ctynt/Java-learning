package top.yxtong.java.basic.operation;

import java.util.Scanner;

public class PointDistance {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入(x1,y1)：");
        Double x1=scan.nextDouble();
        Double y1=scan.nextDouble();
        System.out.print("请输入（x2,y2)：");
        Double x2=scan.nextDouble();
        Double y2=scan.nextDouble();
        Double a=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        System.out.println("两点距离为"+Math.pow(a,0.5));
        scan.close();


    }
}
