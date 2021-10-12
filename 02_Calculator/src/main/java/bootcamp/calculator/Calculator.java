package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculator {
    public BigDecimal calculate(final Params params) throws IllegalArgumentException {
        switch (params.getOperator()) {
            case "+":
                return this.Add(params);
            case "-":
                return this.Subtract(params);
            case "x":
                return this.Multiply(params);
            case "/":
                return this.Divide(params);
            default:
                throw new IllegalArgumentException();
        }
    }

    public BigDecimal Add(Params params) {
        return params.getX().add(params.getY(), new MathContext(1, RoundingMode.FLOOR));
    }

    public BigDecimal Subtract(Params params) {
        return params.getX().subtract(params.getY(), new MathContext(1, RoundingMode.FLOOR));
    }

    public BigDecimal Multiply(Params params) {
        return params.getX().multiply(params.getY(), new MathContext(2, RoundingMode.UNNECESSARY));
    }

    public BigDecimal Divide(Params params) {
        return params.getX().divide(params.getY(), new MathContext(2, RoundingMode.UNNECESSARY));
    }

}
