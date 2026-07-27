package QSpider_Tasks.hotel;

import java.util.Scanner;

public class Calculator {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        calc();
    }

    public static void calc() throws Exception {


        boolean flag = true;
        do {
            System.out.println("List Of Operation");
            Thread.sleep(800);
            System.out.println("1.Addition");
            Thread.sleep(500);
            System.out.println("2.Subtraction");
            Thread.sleep(500);
            System.out.println("3.Multiplication");
            Thread.sleep(400);
            System.out.println("4.division");
            Thread.sleep(400);
            System.out.println("5.Exit");
            Thread.sleep(400);
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the first number as a: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the second number as b: ");
                    double num2 = input.nextDouble();
                    Addition(num1, num2);
                }
                case 2 -> {
                    System.out.print("Enter the first number as a: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the second number as b: ");
                    double num2 = input.nextDouble();
                    Subtraction(num1, num2);
                }
                case 3 -> {
                    System.out.print("Enter the first number as a: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the second number as b: ");
                    double num2 = input.nextDouble();
                    Multiplication(num1, num2);
                }
                case 4 -> {
                    System.out.print("Enter the first number as a: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the second number as b: ");
                    double num2 = input.nextDouble();
                    Division(num1, num2);
                }
                case 5 -> {
                    flag = false;
                }

            }
        } while (flag);
    }

    public static void Addition(double a, double b) throws Exception {
        System.out.println("Addition");
        Thread.sleep(500);
        System.out.println("Addition a and b is " + (a + b));
        Thread.sleep(500);
        System.out.println("*******************************************************");
        Thread.sleep(900);
    }

    public static void Subtraction(double a, double b) throws Exception {
        System.out.println("Subtraction");
        Thread.sleep(500);
        System.out.println("Subtraction a and b is " + (a - b));
        Thread.sleep(500);
        System.out.println("*******************************************************");
        Thread.sleep(900);
    }

    public static void Multiplication(double a, double b) throws Exception {
        System.out.println("Multiplication");
        Thread.sleep(500);
        System.out.println("Multiplication a and b is " + (a * b));
        Thread.sleep(500);
        System.out.println("*******************************************************");
        Thread.sleep(900);
    }

    public static void Division(double a, double b) throws Exception {
        System.out.println("Division");
        Thread.sleep(500);
        System.out.println("Division a and b is " + (a / b));
        Thread.sleep(500);
        System.out.println("*******************************************************");
        Thread.sleep(900);
    }
}
