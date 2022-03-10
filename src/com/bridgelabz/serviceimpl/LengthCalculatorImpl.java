package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.Line;
import com.bridgelabz.service.LengthCalculator;

public class LengthCalculatorImpl implements LengthCalculator {

    @Override
    public Double calLengthOfLine(Line firstLine) {
        return Math.sqrt((firstLine.getEndOfX() - firstLine.getStartOfX()) *
                (firstLine.getEndOfX() - firstLine.getStartOfX()) +
                (firstLine.getEndOfY() - firstLine.getStartOfX()) *
                        (firstLine.getEndOfY() - firstLine.getStartOfY())

        );
    }
}
