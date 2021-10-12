package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculator {
    public BigDecimal calculate(final Params params) throws IllegalArgumentException {
//            if(params.getOperator().equals("+")) {
//                return params.getX().add(params.getY(), new MathContext(1, RoundingMode.FLOOR));
//            }
        switch(params.getOperator()) {
            case "+":
                return params.getX().add(params.getY(), new MathContext(1, RoundingMode.FLOOR));
            case "-":
                return params.getX().subtract(params.getY(), new MathContext(1, RoundingMode.FLOOR));
            case "x":
                return params.getX().multiply(params.getY(), new MathContext(2, RoundingMode.UNNECESSARY));
            case "/":
                return params.getX().divide(params.getY(), new MathContext(2, RoundingMode.UNNECESSARY));
            default:
                throw new IllegalArgumentException();
        }
    }
}
