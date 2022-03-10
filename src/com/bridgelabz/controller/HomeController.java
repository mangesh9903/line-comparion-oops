package com.bridgelabz.controller;

import com.bridgelabz.model.Line;
import com.bridgelabz.service.LengthCalculator;
import com.bridgelabz.serviceimpl.LengthCalculatorImpl;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Problem.");

        Scanner sc=new Scanner(System.in);

        LengthCalculator lengthCalculator=new LengthCalculatorImpl();

        System.out.println(" Enter the value of First Line X1 , X2 , Y1 , Y2");
        Line firstLine=new Line(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        Double firstLinecal=lengthCalculator.calLengthOfLine(firstLine);
        System.out.println("Length Of Line  : "+firstLinecal);
    }
}
