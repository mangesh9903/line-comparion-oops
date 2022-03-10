package com.bridgelabz.service;

import com.bridgelabz.model.Line;

public interface LineComparator {
    void compareUsingEquals(Line firstLine, Line secondLine);
    void compareUsingCompareTo(Line firstLine , Line secondLine);

}