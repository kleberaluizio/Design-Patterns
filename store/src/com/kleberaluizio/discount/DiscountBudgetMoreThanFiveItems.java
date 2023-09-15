package com.kleberaluizio.discount;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class DiscountBudgetMoreThanFiveItems extends Discount {

    public DiscountBudgetMoreThanFiveItems(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal performCalculation(Budget budget){
         return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean mustApply(Budget budget) {
        return budget.getItemsQuantity() > 5;
    }
}
