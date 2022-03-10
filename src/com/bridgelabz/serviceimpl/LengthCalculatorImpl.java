package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.Line;
import com.bridgelabz.service.LengthCalculator;

public class LengthCalculatorImpl implements LengthCalculator {

    /**UseCase 1 ( Calculate Line Length)
     *
     * @param firstLine Passing Line Object To Calulate Length of Line
     * @return   returning Calculated Length
     */
    @Override
    public Double calLengthOfLine(Line firstLine) {
        return Math.sqrt((firstLine.getEndOfX() - firstLine.getStartOfX()) *
                (firstLine.getEndOfX() - firstLine.getStartOfX()) +
                (firstLine.getEndOfY() - firstLine.getStartOfX()) *
                        (firstLine.getEndOfY() - firstLine.getStartOfY())

        );
    }
}
