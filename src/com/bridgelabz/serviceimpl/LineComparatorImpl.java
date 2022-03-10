package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.Line;
import com.bridgelabz.service.LengthCalculator;

public class LineComparatorImpl implements com.bridgelabz.service.LineComparator {

    LengthCalculator lengthCalculator = new LengthCalculatorImpl();

    /**
     * UseCase2 Comparing Lines Using Equals Function
     *
     * @param firstLine  passing First Line Object
     * @param secondLine passing Second Line Object
     */
    @Override
    public void compareUsingEquals(Line firstLine, Line secondLine) {
        Double firstLineCal = lengthCalculator.calLengthOfLine(firstLine);
        Double secondLineCal = lengthCalculator.calLengthOfLine(secondLine);

        if (firstLineCal.equals(secondLineCal)) {
            System.out.println("Line1 is Equal to Line2 ");
        } else {
            System.out.println("Line1 is not Equal to Line2 ");
        }
    }

    /**
     * Use Case 3 Compare Two Lines Using CompareTo Method
     *
     * @param firstLine  passing First Line Object
     * @param secondLine passing Second Line Object
     */
    @Override
    public void compareUsingCompareTo(Line firstLine, Line secondLine) {
        Double firstLineCal = lengthCalculator.calLengthOfLine(firstLine);
        Double secondLineCal = lengthCalculator.calLengthOfLine(secondLine);
        int comparevalue = firstLineCal.compareTo(secondLineCal);
        if (comparevalue == 0) {
            System.out.println("Both Lines are Equals ");
        } else if (comparevalue < 0) {
            System.out.println("Line1 is less than Line2 ");
        } else {
            System.out.println("Line1 is greater than Line2 ");
        }
    }

}
