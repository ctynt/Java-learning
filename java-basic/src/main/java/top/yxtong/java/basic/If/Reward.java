package top.yxtong.java.basic.If;

import java.util.Scanner;

public class Reward {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入4位卡号：");
        int num1 = input.nextInt();
        int num2 = num1 / 1000;
        int num3 = num1 % 1000 / 100;
        int num4 = num1 % 1000 % 100 / 10;
        int num5 = num1 % 1000 % 100 % 10;
        int num6 = num2 + num3 + num4 + num5;
        System.out.println("会员卡号" + num1 + "各位之和：" + num6);
        System.out.print("是幸运用户吗?");
        if (num6>20){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
