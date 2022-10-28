package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String greetingsInCalculator() {
        return calculatorService.greetingsInCalculator();
    }
    @GetMapping(path = "/calculator/plus")
    public int plusNumbers(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.plusNumbers(a, b);
    }
    @GetMapping(path = "/calculator/minus")
    public int minusNumbers(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.minusNumbers(a, b);
    }
    @GetMapping(path = "/calculator/multiply")
    public int multiplyNumbers(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.multiplyNumbers(a, b);
    }
    @GetMapping(path = "/calculator/divide")
    public float divideNumbers(@RequestParam("num1") float a, @RequestParam("num2") float b) {
        return calculatorService.divideNumbers(a, b);
    }
}
