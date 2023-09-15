package com.kleberaluizio.status;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class Disapproved extends BudgetStatus{

    @Override
    public void finalize(Budget budget) {
        budget.setStatus(new Finalized());
    }
}
