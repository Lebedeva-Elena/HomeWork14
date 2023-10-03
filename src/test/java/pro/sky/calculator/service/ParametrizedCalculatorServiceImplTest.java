package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.sql.SQLOutput;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParametrizedCalculatorServiceImplTest {

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideNums")
    void plus(int num1, int num2) {

        long result = calculatorService.plus(num1, num2);

        assertEquals((long) num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideNums")
    void minus(int num1, int num2) {

        long result = calculatorService.minus(num1, num2);

        assertEquals((long) num1 - num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideNums")
    void multiply(int num1, int num2) {

        long result = calculatorService.multiply(num1, num2);

        assertEquals((long) num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideNums")
    void divide(int num1, int num2) {

        double result = calculatorService.divide(num1, num2);

        assertEquals((double) num1 / num2, result);
    }

    private static Stream<Arguments> provideNums() {
        return Stream.of(
                Arguments.of(5, 2),
                Arguments.of(5, -6),
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE)
        );

    }
}