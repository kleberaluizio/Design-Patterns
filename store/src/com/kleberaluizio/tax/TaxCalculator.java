package com.kleberaluizio.tax;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, Tax tax){
        return tax.calculate(budget);
    }
}
