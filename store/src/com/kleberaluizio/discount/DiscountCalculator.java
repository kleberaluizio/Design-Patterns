package com.kleberaluizio.discount;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget){

        Discount discount =
                new DiscountBudgetMoreThanFiveItems(
                new DiscountBudgetMoreThan500Value(
                        new DiscountZero()));

        return discount.calculate(budget);

    }
}
