package texCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    private TaxCalculator calculator;
    private Citizen dewunmi;
    private Citizen adeola;
    private Citizen mathias;

    @BeforeEach
    public void setUp(){
        mathias = new Citizen();
        mathias.setFirstName("Mathias");
        mathias.setSurname("Momodu");
        BigDecimal salary = new BigDecimal(17000);
        mathias.setEarnings(salary);

        dewunmi = new Citizen("Adewunmi","Adegunwa");
        dewunmi.setEarnings(BigDecimal.valueOf(25000));

        adeola = new Citizen("Adeola","Adekunle",BigDecimal.valueOf(45000));
    }
    @Test
    public void calculateTax() {
        BigDecimal mathiasTax = TaxCalculator.calculateTax(17000);
        assertEquals(2550, mathiasTax.intValue());

        BigDecimal dewunmiTax = TaxCalculator.calculateTax(25000);
        assertEquals(3750, dewunmiTax.intValue());
    }


    @Test
    public void calculateExcessTax(){
        BigDecimal  adeolaTax = TaxCalculator.calculateTax(45000);
        assertEquals(7500,adeolaTax.intValue());
    }
    }