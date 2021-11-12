package com.Hello;
import java.util.Scanner;
public class guess {
    public static void main(String[] args){
        System.out.println("Enter a number less then 100 press -1 to exit anytime");
        int myNum=(int)(Math.random()*31);
      System.out.println(myNum);
      int count=0;

        do{
            System.out.println("guess the Number: ");
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            if(a==myNum){
                System.out.println("congo!!! You Have Won ");
                break;
            }else if(a > myNum){
                System.out.println("You have entered a large number: ");
                System.out.println("try again "+(10-count)+" Chance remaining");
                count++;
                if(count>10){
                    System.out.println("you have exceeded the maximum iteration");
                    break;
                }

            }
            else if(a < myNum){
                System.out.println("You have entered a small number: ");
                System.out.println("try again "+(10-count)+" Chance remaining");
                count++;
                if(count>10){
                    System.out.println("you have exceeded the maximum iteration");
                    break;
                }
            }
            else if(a==-1){
                System.out.println("Thanks for playing try next time: ");
                System.out.println("the number was: " + myNum);
                break;
            }else {
                System.out.println("try again "+(10-count)+" Chance remaining");
                count++;
                if(count>10){
                    System.out.println("you have exceeded the maximum iteration");
                    break;
                }
            }
        }while(true);
    }
}
