package ua.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    //Перевірити, що виклик sum(1) повертає 1
    @Test
    void testThatSumCalculationMethodWorksOkFor1() {
        int inputNumber = 1;
        int expectedSum = 1;

        int actualSum = calculator.sum(inputNumber);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    //Перевірити, що виклик sum(3) повертає 6
    @Test
    void testThatSumCalculationMethodWorksOkFor6() {
        int inputNumber = 3;
        int expectedSum = 6;

        int actualSum = calculator.sum(inputNumber);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    //Перевірити, що виклик sum(0) повертає IllegalArgumentException
    @Test
    void testThatSumCalculationMethodReturnIllegalArgumentExceptionFor0() {
        int inputNumber = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(inputNumber));
    }

}