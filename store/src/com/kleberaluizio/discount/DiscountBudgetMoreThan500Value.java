package com.kleberaluizio.discount;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class DiscountBudgetMoreThan500Value extends Discount {

    public DiscountBudgetMoreThan500Value(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget){

        if (budget.getValue().compareTo(new BigDecimal("500")) > 0){
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }
        return next.calculate(budget);
    }

}
