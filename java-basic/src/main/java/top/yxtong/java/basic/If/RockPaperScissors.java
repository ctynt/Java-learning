package top.yxtong.java.basic.If;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        for(int i = 1; i<=10;i++){
            System.out.print("scissor(0),rock(1),paper(2):");
            Scanner sc = new Scanner(System.in);
            int enter = sc.nextInt();
            int randomNumber=new Random().nextInt(2);
            if(enter==0) {
                if(randomNumber==0) {
                    System.out.println("The computer is scissor.");
                    System.out.println("You are scissor too.It is a draw.");
                }else if(randomNumber==1) {
                    System.out.println("The computer is rock.");
                    System.out.println("You are scissor.You lose.");
                    b++;
                }else if(randomNumber==2) {
                    System.out.println("The computer is paper.");
                    System.out.println("You are scissor.You won");
                    a++;
                }
            }else if(enter==1) {
                if(randomNumber==0) {
                    System.out.println("The computer is scissor.");
                    System.out.println("You are rock. You won.");
                    a++;
                }else if(randomNumber==1) {
                    System.out.println("The computer is rock.");
                    System.out.println("You are rock too.It is a draw.");
                }else if(randomNumber==2) {
                    System.out.println("The computer is paper.");
                    System.out.println("You are rock.You lose.");
                    b++;
                }
            }else if(enter==2) {
                if(randomNumber==0) {
                    System.out.println("The computer is scissor.");
                    System.out.println("You are paper.You lose.");
                    b++;
                }else if(randomNumber==1) {
                    System.out.println("The computer is rock.");
                    System.out.println("You are rock.You won.");
                    a++;
                }else if(randomNumber==2) {
                    System.out.println("The computer is paper.");
                    System.out.println("You are paper too.It is a draw.");
                }
            }if(a==2){
                System.out.print("You won twice!");
                break;
            }if(b==2){
                System.out.print("Computer won twice!");
                break;
            }
        }
    }
}
