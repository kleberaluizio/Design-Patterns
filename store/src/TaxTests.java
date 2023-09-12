import com.kleberaluizio.budget.Budget;
import com.kleberaluizio.tax.ISS;
import com.kleberaluizio.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator taxCalc = new TaxCalculator();

        System.out.println(taxCalc.calculate(budget, new ISS()));
    }
}