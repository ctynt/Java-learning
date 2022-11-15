package top.yxtong.java.basic.For;

import java.util.Scanner;

public class ProportionOfAge {
    public static void main(String[] args) {
        int age=0,count1=0,count2=0;
        for(int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"位顾客的年龄：");
            Scanner input=new Scanner(System.in);
            age=input.nextInt();
            if(age>=30){
                count1++;
            }else if (0<age&&age<=30){
                count2++;
            }
        } double b1=count1*10;
        double b2=count2*10;
        System.out.println("30岁以下的比例是:"+b2+"%");
        System.out.println("30岁以上的比例是:"+b1+"%");

    }
}
