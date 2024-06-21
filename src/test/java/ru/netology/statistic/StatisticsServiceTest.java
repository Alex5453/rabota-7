package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMaxInMiddle() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long expected = 10;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxInBeginning() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        long expected = 10;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxInEnd() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        long expected = 11;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        long expected = 5;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }
}
