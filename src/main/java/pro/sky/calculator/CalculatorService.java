package pro.sky.calculator;


import org.springframework.stereotype.Service;


@Service
public class CalculatorService {

    public String greetingsInCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    public int plusNumbers(int a, int b) {
        return a + b;
    }
    public int minusNumbers(int a, int b) {
        return a - b;
    }

    public int multiplyNumbers(int a, int b) {
        return a * b;
    }
    public float divideNumbers(float a, float b) {
        return a / b;
    }

}
