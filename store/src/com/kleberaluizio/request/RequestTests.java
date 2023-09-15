package com.kleberaluizio.request;

import com.kleberaluizio.budget.Budget;
import com.kleberaluizio.request.GenerateRequest;
import com.kleberaluizio.request.GenerateRequestHandler;
import com.kleberaluizio.request.Request;
import com.kleberaluizio.request.action.SaveRequestInDatabase;
import com.kleberaluizio.request.action.SendRequestEmail;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class RequestTests {
    public static void main(String[] args) {
        String client = "Rodrigo";
        BigDecimal budgetValue = new BigDecimal("300");
        int itemQuantity = Integer.parseInt("2") ;

        GenerateRequest generator = new GenerateRequest(client, budgetValue, itemQuantity);
        GenerateRequestHandler handler = new GenerateRequestHandler(
                Arrays.asList(
                        new SendRequestEmail(),
                        new SaveRequestInDatabase()
                )
        );
        handler.execute(generator);



    }
}
