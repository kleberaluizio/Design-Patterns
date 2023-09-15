package com.kleberaluizio.status;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetStatus {

    @Override
    public BigDecimal applyExtraDiscount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setStatus(new Approved());
    }

    @Override
    public void disapprove(Budget budget) {
        budget.setStatus(new Disapproved());
    }
}
