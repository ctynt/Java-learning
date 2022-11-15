package top.yxtong.java.basic.If;

import java.util.Scanner;

public class MemberInformation {
    public static void main(String[] args) {
        System.out.println("请输入会员号（<4位整数>）：" );
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("请输入会员生日（月/日<用两位数表示>）：09/12");
        System.out.println("请输入积分：");
        int num2 = input.nextInt();
        if (num1 >=1000&&num1<=9999) {
            System.out.println("已录入的会员信息是：");
            System.out.println(num1 + "\t\t\t" + "09/12\t\t\t" + num2);
        }else{
            System.out.println("客户"+num1+"是无效会员号！");
            System.out.println("录入信息失败！");
        }

    }
}
