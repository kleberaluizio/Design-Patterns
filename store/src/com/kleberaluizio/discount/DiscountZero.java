package com.kleberaluizio.discount;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class DiscountZero extends Discount{

    public DiscountZero() {
        super(null);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean mustApply(Budget budget) {
        return true;
    }
}
