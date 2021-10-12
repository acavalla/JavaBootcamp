package bootcamp.app;

import bootcamp.calculator.Calculator;
import bootcamp.data.Params;

import java.math.BigDecimal;

/**
 * TODO: The application should be able to handle 3 arguments (first number, second number, operation).
 * The application should write the results to the standard output.
 */
public class CalculatorApp {
    public static void main(String[] args) {
        Params params = new Params(new BigDecimal(args[0]), new BigDecimal(args[1]), args[2]);
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(params));
    }
}
