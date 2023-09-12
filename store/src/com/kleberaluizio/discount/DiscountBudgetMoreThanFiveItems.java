package com.kleberaluizio.discount;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class DiscountBudgetMoreThanFiveItems extends Discount {

    public DiscountBudgetMoreThanFiveItems(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget){

        if(budget.getItemsQuantity() > 5){
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(budget);
    }
}
