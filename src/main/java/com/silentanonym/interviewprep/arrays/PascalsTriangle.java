package com.silentanonym.interviewprep.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentRow, previousRow = null;
        for (int rowNo = 0; rowNo < numRows; ++rowNo) {
            currentRow = new ArrayList<>();
            for (int columnIndex = 0; columnIndex <= rowNo; ++columnIndex) {
                if (columnIndex == 0 || columnIndex == rowNo) {
                    currentRow.add(1);
                } else {
                    currentRow.add(previousRow.get(columnIndex - 1) + previousRow.get(columnIndex));
                }
            }
            previousRow = new ArrayList<>(currentRow);
            result.add(currentRow);
        }
        return result;
    }
}
