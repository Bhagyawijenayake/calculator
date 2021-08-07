package com.kelaniya.uni;

import java.io.File;
import java.util.Scanner;


public class Calculator {

    static void sum(Scanner scanner) {
        int summation=0,i=0;

        while (scanner.hasNextInt()){
            int nextInt=scanner.nextInt();
            summation+=nextInt;
            i++;
        }
        System.out.println("Summation:"+summation);
    }

    static void mul(Scanner scanner) {
        int i=0;
        int val=1;

        while (scanner.hasNextInt()){
            int nextInt=scanner.nextInt();
            val*=nextInt;
            i++;
        }
        System.out.println("Multiplication:"+val);
    }

    static void div(Scanner scanner) {
        double val= scanner.nextInt();
        int i=0;

        while (scanner.hasNextInt()){
            int nextInt=scanner.nextInt();
            val/=nextInt;
            i++;
        }
        System.out.println("Division:"+val);
    }


    public static void main(String[] args) throws Exception  {

        Scanner num=new Scanner(new File("C:\\Users\\Asus\\Desktop\\Calculator\\calculator\\src\\java\\com\\kelaniya\\uni\\numbers.txt"));

        System.out.println("Select: 1 for sum,\t2 for mul,\t3 for div");

        Scanner sc=new Scanner(System.in);
        int selection=sc.nextInt();

        switch (selection){
            case 1:
                sum(num);
                break;
            case 2:
                mul(num);
                break;
            case 3:
                div(num);
                break;
            default:
                System.out.println("Error!");
        }

    }


}

