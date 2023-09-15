package com.kleberaluizio.request;

import com.kleberaluizio.budget.Budget;
import com.kleberaluizio.request.action.ActionAfterGenerateRequest;
import com.kleberaluizio.request.action.SaveRequestInDatabase;
import com.kleberaluizio.request.action.SendRequestEmail;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateRequestHandler {

    private List<ActionAfterGenerateRequest> actions;

    public GenerateRequestHandler(List<ActionAfterGenerateRequest> actions) {
        this.actions = actions;
    }

    public void execute(GenerateRequest data){

        Budget budget = new Budget(data.getBudgetValue(), data.getItemQuantity());
        Request request = new Request(data.getClient(), LocalDateTime.now(),budget);

        actions.forEach(a -> a.executeAction(request));
    }
}
