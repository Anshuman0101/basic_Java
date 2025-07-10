package week_2;

import java.util.Scanner;

public class basic {


     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Income :-");
        // int income = sc.nextInt();
        // int p = 250000;

        // if (income <= p) {
        //     System.out.println("No tax");

        // } else if (income > p && income <= (p * 2)) {
        //     System.out.println("5% tax");

        // } else if (income > (p * 2) && income <= (p * 4)) {
        //     System.out.println("20% tax");

        // } else if (income > (p * 4)) {
        //     System.out.println("30% tax");

        // } else {
        //     System.out.println("Invalid income");
        // }







        // System.out.println("Enter the unit :-");
        // int unit=sc.nextInt();

        // if(unit>0&&unit<=100){
        //     System.out.println(unit*1.50);

        // }else if(unit>101&&unit<=300){
        //    if(unit>200){
        //       System.out.println((unit*2)+50);
        //    }
        // }else if(unit<300){
        //      System.out.println((unit*3)+50);
        // }

       


 System.out.println("Enter the Marks:-1");
        int n1 = sc.nextInt();

        System.out.println("Enter the Marks:-2");
        int n2 = sc.nextInt();

        System.out.println("Enter the Marks:-3");
        int n3 = sc.nextInt();

        System.out.println("Enter the Marks:-4");
        int n4 = sc.nextInt();

        System.out.println("Enter the Marks:-5");
        int n5 = sc.nextInt();

        int average = (n1 + n2 + n3 + n4 + n5) / 5;

        if (n1 < 35 || n2 < 35 || n3 < 35 || n4 < 35 || n5 < 35) {
            System.out.println("Fail");
        } else {
            if (average >= 90) {
                System.out.println("Average: " + average + " ... Grade A");
            } else if (average >= 75 && average <= 89) {
                System.out.println("Average: " + average + " ... Grade B");
            } else if (average >= 60 && average <= 74) {
                System.out.println("Average: " + average + " ... Grade C");
            } else {
                System.out.println("Average: " + average + " ... Grade D");
            }
        }}}