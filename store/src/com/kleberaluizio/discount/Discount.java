package com.kleberaluizio.discount;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next){
        this.next = next;
    }

    public abstract BigDecimal calculate (Budget budget);

}
