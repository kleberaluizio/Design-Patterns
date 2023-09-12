package com.kleberaluizio.tax;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal calculate(Budget budget);
}
