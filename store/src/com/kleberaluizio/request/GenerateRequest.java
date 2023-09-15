package com.kleberaluizio.request;

import com.kleberaluizio.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateRequest {

    private String client;
    private BigDecimal budgetValue;
    private int itemQuantity;

    public GenerateRequest(String client, BigDecimal budgetValue, int itemQuantity) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.itemQuantity = itemQuantity;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}
