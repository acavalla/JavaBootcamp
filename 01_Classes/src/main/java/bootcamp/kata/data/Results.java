/*
  @author Omar Bashir
 */
package bootcamp.kata.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Results {
    private BigDecimal sum;
    private BigDecimal difference;
    private BigDecimal product;
    private BigDecimal quotient;

    public Results (Params params) {
        this.difference = params.getX().subtract(params.getY());
        this.product = params.getX().multiply(params.getY());
        this.sum = params.getX().add(params.getY());
        this.quotient = params.getX().divide(params.getY());
    }

    public final BigDecimal getSum() {
        return sum;
    }

    public final BigDecimal getDifference() {
        return difference;
    }

    public final BigDecimal getProduct() {
        return product;
    }

    public final BigDecimal getQuotient() {
        return quotient;
    }
}
