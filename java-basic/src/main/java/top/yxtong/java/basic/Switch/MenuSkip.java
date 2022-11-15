package top.yxtong.java.basic.Switch;

import java.util.Scanner;

public class MenuSkip {
    public static void main(String[] args) {
        System.out.println("欢迎使用购物管理系统");
        System.out.println("1.登录系统");
        System.out.println("2.退出");
        System.out.println("*****************************");
        System.out.println("请输入选择，输入数字:");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int num1 = input.nextInt();
            switch (num1) {
                case 1:
                    System.out.println("欢迎使用购物管理系统");
                    System.out.println("******************************");
                    System.out.println("1.客户信息管理");
                    System.out.println("2.购物结算");
                    System.out.println("3.真情回馈");
                    System.out.println("4.注销");
                    System.out.println("******************************");
                    break;
            }
            System.out.println("请输入选择，输入数字:");
            int num2 = input.nextInt();
            switch (num2) {
                case 1:
                    System.out.println("欢迎使用购物管理系统");
                    System.out.println("******************************");
                    System.out.println("1.显示所有客户信息");
                    System.out.println("2.添加客户信息");
                    System.out.println("3.修改客户信息");
                    System.out.println("4.查询客户信息");
                    System.out.println("******************************");
                    break;
                case 3:
                    System.out.println("欢迎使用购物管理系统");
                    System.out.println("******************************");
                    System.out.println("1.幸运大放送");
                    System.out.println("2.幸运抽奖");
                    System.out.println("3.生日问候");
                    System.out.println("******************************");
                    break;
            }

        }
    }
}
