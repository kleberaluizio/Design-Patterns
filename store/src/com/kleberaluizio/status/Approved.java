package com.kleberaluizio.status;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetStatus{

    @Override
    public BigDecimal applyExtraDiscount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalize(Budget budget) {
        budget.setStatus(new Finalized());
    }
}
