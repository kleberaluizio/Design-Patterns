package com.kleberaluizio.discount;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class DiscountZero extends Discount{

    public DiscountZero() {
        super(null);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        return BigDecimal.ZERO;
    }
}
