package bootcamp.data;

import java.math.BigDecimal;

public class Params {
    private BigDecimal x;
    private BigDecimal y;
    private String operator;

    public Params(final BigDecimal x, final BigDecimal y, final String operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
    }

    public BigDecimal getX() {
        return this.x;
    }

    public BigDecimal getY() {
        return this.y;
    }

    public String getOperator() {
        return this.operator;
    }
}
