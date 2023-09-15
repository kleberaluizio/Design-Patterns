package com.kleberaluizio.status;

import com.kleberaluizio.DomainException;
import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public class BudgetStatus  {

    public BigDecimal applyExtraDiscount(Budget budget){
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget){
        throw new DomainException("Budget cannot be approved!");
    }

    public void disapprove(Budget budget){
        throw new DomainException("Budget cannot be disapproved!");
    }

    public void finalize(Budget budget){
        throw new DomainException("Budget cannot be finalized!");
    }
}
