package com.kleberaluizio.request.action;

import com.kleberaluizio.request.Request;

public class SaveRequestInDatabase implements ActionAfterGenerateRequest{

    public void executeAction(Request request){
        System.out.println("Saving request in the database");
    }
}
