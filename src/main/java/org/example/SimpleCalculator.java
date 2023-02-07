package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class SimpleCalculator {
    private double num1;
    private double num2;

    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }

    public void setNum1(double num1){
        this.num1 = num1;
    }

    public void setNum2(double num2){
        this.num2 = num2;
    }

}
class Addition extends SimpleCalculator{
    double calculate(){
        return getNum1() + getNum2();
    }
}

class Subtraction extends SimpleCalculator {
    double calculate(){
        return getNum1() - getNum2();
    }
}

class Multiplication extends SimpleCalculator{
    double calculate(){
        return getNum1() * getNum2();
    }
}

class Division extends SimpleCalculator{
    double calculate(){
        return getNum1() / getNum2();
    }
}

class Main{
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);
        SimpleCalculator c = new SimpleCalculator();
        int choice;
        String s;
        double num1;
        double num2;
        logger.info("Enter 1st number : ");
        num1 = sc.nextDouble();
        logger.info("Enter 2nd number : ");
        num2 = sc.nextDouble();
        c.setNum1(num1);
        c.setNum2(num2);
        boolean flag = true;
        while(flag) {
            logger.info("1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Enter new values\n 6. Exit");
            logger.info("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    Addition add = new Addition();
                    num1 = c.getNum1();
                    num2 = c.getNum2();
                    c = add;
                    c.setNum1(num1);
                    c.setNum2(num2);
                    s = "Addition : " + add.calculate();
                    logger.info(s);
                    break;
                case 2:
                    Subtraction sub = new Subtraction();
                    num1 = c.getNum1();
                    num2 = c.getNum2();
                    c = sub;
                    c.setNum1(num1);
                    c.setNum2(num2);
                    s = "Subtraction : " + sub.calculate();
                    logger.info(s);
                    break;
                case 3:
                    Multiplication mul = new Multiplication();
                    num1 = c.getNum1();
                    num2 = c.getNum2();
                    c = mul;
                    c.setNum1(num1);
                    c.setNum2(num2);
                    s = "Multiplication : " + mul.calculate();
                    logger.info(s);
                    break;
                case 4:
                    Division div = new Division();
                    num1 = c.getNum1();
                    num2 = c.getNum2();
                    c = div;
                    c.setNum1(num1);
                    c.setNum2(num2);
                    s = "Division : " + div.calculate();
                    logger.info(s);
                    break;
                case 5:
                    logger.info("Enter num1 : ");
                    num1 = sc.nextDouble();
                    logger.info("Enter num2 : ");
                    num2 = sc.nextDouble();
                    c.setNum1(num1);
                    c.setNum2(num2);
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }

}



























