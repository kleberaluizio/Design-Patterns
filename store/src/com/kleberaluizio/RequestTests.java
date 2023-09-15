package com.kleberaluizio;

import com.kleberaluizio.budget.Budget;
import com.kleberaluizio.request.Request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RequestTests {
    public static void main(String[] args) {

        Budget budget = new Budget(new BigDecimal("600"),4 );
        String client = "Ana da Silva";
        LocalDateTime data = LocalDateTime.now();

        Request request = new Request(client,data,budget);

    }
}
