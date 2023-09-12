package com.kleberaluizio;

import com.kleberaluizio.budget.Budget;
import com.kleberaluizio.discount.DiscountCalculator;
import com.kleberaluizio.tax.ICMS;
import com.kleberaluizio.tax.ISS;
import com.kleberaluizio.tax.TaxCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget firstBudget = new Budget(new BigDecimal("200"),6);
        Budget secondBudget = new Budget(new BigDecimal("1000"),1);

        DiscountCalculator discCalc = new DiscountCalculator();

        System.out.println(discCalc.calculate(firstBudget));
        System.out.println(discCalc.calculate(secondBudget));



    }
}
