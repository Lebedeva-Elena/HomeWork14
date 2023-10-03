package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.DivideException;

import javax.websocket.DecodeException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    private int num1 = 5;
    private int num2 = 2;
    @Test
    void plus_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {


        long result = calculatorService.plus(num1, num2);

        assertEquals(num1 + num2, result);
    }

    @Test
    void plus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNub2BiggerThenNum1() {
        num2 = -6;

        long result = calculatorService.plus(num1, num2);

        assertEquals(num1 + num2, result);
    }

    @Test
    void minus_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {

        long result = calculatorService.minus(num1, num2);

        assertEquals(num1 - num2, result);
    }
    @Test
    void minus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegative() {
        num2 = -6;

        long result = calculatorService.minus(num1, num2);

        assertEquals(num1 - num2, result);

    }

    @Test
    void multiply_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {

        long result = calculatorService.multiply(num1, num2);

        assertEquals((long) num1 * num2, result);
    }
    @Test
    void multiply_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegative() {
        num2 = -6;

        long result = calculatorService.multiply(num1, num2);

        assertEquals((long) num1 * num2, result);
    }

    @Test
    void divide_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {

        double result = calculatorService.divide(num1, num2);

        assertEquals((double) num1 / num2, result);
    }

    @Test
    void divide_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegative() {
        num2 = -5;

        double result = calculatorService.divide(num1, num2);

        assertEquals((double) num1 / num2, result);
    }

    @Test
    void divide_shouldThroeExceptionWhenNum2Is0() {
        num2 = 0;

        DivideException result = assertThrows(DivideException.class,
                () -> calculatorService.divide(num1, num2));
        assertEquals("Делить на 0 нельзя", result.getMessage());
    }
}