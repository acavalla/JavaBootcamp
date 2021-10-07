/* * @author Omar Bashir */
package bootcamp.kata.data;

import java.math.BigDecimal;

public class Params {
    private BigDecimal x;
    private BigDecimal y;

    public Params(final BigDecimal x, final BigDecimal y) {
        this.x = x;
        this.y = y;
    }

    public final BigDecimal getX() {
        return this.x;
    }

    public final BigDecimal getY() {
        return this.y;
    }
}
