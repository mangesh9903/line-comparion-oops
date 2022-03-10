package com.bridgelabz.controller;

import com.bridgelabz.model.Line;
import com.bridgelabz.service.LengthCalculator;
import com.bridgelabz.service.LineComparator;
import com.bridgelabz.serviceimpl.LengthCalculatorImpl;
import com.bridgelabz.serviceimpl.LineComparatorImpl;

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

        System.out.println(" Enter the value of Second Line X1 , X2 , Y1 ,Y2");
        Line secondLine=new Line(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        Double secondLineCal=lengthCalculator.calLengthOfLine(secondLine);
        System.out.println("Length Of Line  : "+secondLineCal);

        LineComparator lengthComparator=new LineComparatorImpl();
        lengthComparator.compareUsingEquals(firstLine,secondLine);

    }
}
