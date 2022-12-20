package texCalculator;

import java.math.BigDecimal;

public class TaxCalculator {

    private  static final BigDecimal MINIMUM_EARNINGS = BigDecimal.valueOf(30000);
    private  static final double BASE_TAX_RATE = 0.15;
    private  static final double ADDITIONAL_TAX_RATE = 0.20;

    public static BigDecimal calculateTax(double earning) {
        BigDecimal taxAmount = BigDecimal.ZERO;
        if (earning <= MINIMUM_EARNINGS.doubleValue()) {
            taxAmount = BigDecimal.valueOf(earning * BASE_TAX_RATE);
        } else {
            taxAmount = BigDecimal.valueOf(MINIMUM_EARNINGS.doubleValue() * BASE_TAX_RATE);

            double additionalEarning = earning - MINIMUM_EARNINGS.doubleValue();
            taxAmount = taxAmount.add(BigDecimal.valueOf(additionalEarning * ADDITIONAL_TAX_RATE));

        }
        return taxAmount;
    }
}
