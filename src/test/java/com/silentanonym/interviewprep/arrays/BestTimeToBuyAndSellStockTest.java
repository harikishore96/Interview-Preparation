package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void maxProfit() {
        assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[] {7,1,5,3,6,4}), 5);
        assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[] {7,6,4,3,1}), 0);
    }
}
