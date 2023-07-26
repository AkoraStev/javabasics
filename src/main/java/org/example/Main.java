package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student1 = new Student("James","Elly");
        student1.addScore(90);
        student1.addScore(85);
        student1.addScore(80);
        System.out.println(student1.getFullName()+"average grade:"+student1.calculateAverageGrade());



        System.out.println("Enter your Score");
        Scanner GradingSystem = new Scanner(System.in);
        int score = GradingSystem.nextInt();

        if  (score >= 90) {
            System.out.println("ExcellentWork");
            System.out.println("A");
        }
        else if (score>=80) {
            System.out.println("VeryGoodWork");
            System.out.println("B");
        }
        else if (score>=70){
            System.out.println("GoodWork");
            System.out.println("c");
        }
        else if (score>60){
            System.out.println("FairlyDone");
            System.out.println("D");
        }
        else if (score>=50){
            System.out.println("PoorlyPerformed");
            System.out.println("E");
        }
        else{
            System.out.println("Failed...Report to Dean");
        }
    }
}