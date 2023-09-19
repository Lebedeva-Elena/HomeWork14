package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {

        long result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {

        long result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {

        long result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {

        double result = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }
}
