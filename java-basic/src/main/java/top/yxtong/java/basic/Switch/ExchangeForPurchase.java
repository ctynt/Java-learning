package top.yxtong.java.basic.Switch;

import java.util.Scanner;

public class ExchangeForPurchase {
    public static void main(String[] args) {
        System.out.println("请输入消费金额：");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
        System.out.println("2：满100元，加3元换购500ml可乐一瓶");
        System.out.println("3：满100元，加10元换购5公斤面粉");
        System.out.println("4：满200元，加10元可换购");
        System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
        System.out.println("0：不换购");
        System.out.println("请选择：");
        if (input.hasNextInt()) {
            int num2 = input.nextInt();
            switch (num2) {
                case 1:
                    if (num1 >= 50) {
                        double num3 = num1 + 2;
                        System.out.println("本次消费金额：" + num3);
                        System.out.println("成功换购：百事可乐饮料一瓶。");
                        break;
                    }
                case 2:
                    if (num1 >= 100) {
                        double num4 = num1 + 3;
                        System.out.println("本次消费金额：" + num4);
                        System.out.println("成功换购：500ml可乐饮料一瓶");
                        break;
                    }
                case 3:
                    if (num1 >= 100) {
                        double num5 = num1 + 10;
                        System.out.println("本次消费金额：" + num5);
                        System.out.println("成功换购：5公斤面粉");
                        break;
                    }
                case 4:
                    if (num1 >= 200) {
                        double num6 = num1 + 10;
                        System.out.println("本次消费金额：" + num6);
                        System.out.println("成功换购：1个苏泊尔炒菜锅");
                        break;
                    }
                case 5:
                    if (num1 >= 200) {
                        double num7 = num1 + 20;
                        System.out.println("本次消费金额：" + num7);
                        System.out.println("成功换购：欧莱雅爽肤水一瓶");
                        break;
                    }
                default:
                    System.out.println("本次消费总金额：" + num1);
                    break;
            }
        }
    }
}
