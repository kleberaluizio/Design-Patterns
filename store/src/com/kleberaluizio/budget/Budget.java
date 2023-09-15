package com.kleberaluizio.budget;

import com.kleberaluizio.status.BudgetStatus;
import com.kleberaluizio.status.InAnalysis;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int itemsQuantity;
    public BudgetStatus status;

    public Budget(BigDecimal value) {
        this.value = value;
        this.status = new InAnalysis();
    }
    public Budget(BigDecimal value, int itemsQuantity) {
        this.value = value;
        this.itemsQuantity = itemsQuantity;
        this.status = new InAnalysis();
    }

    public void applyExtraDiscount(){
        BigDecimal extraDiscountValue = this.status.applyExtraDiscount(this);
        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve(){
        this.status.approve(this);
    }
    public void disapproved(){
        this.status.disapprove(this);
    }
    public void finalize(){
        this.status.finalize(this);
    }

    public BigDecimal getValue(){
        return value;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public BudgetStatus getStatus() {
        return status;
    }

    public void setStatus(BudgetStatus status) {
        this.status = status;
    }
}
