package com.kleberaluizio.request.action;

import com.kleberaluizio.request.Request;

public class SendRequestEmail implements ActionAfterGenerateRequest {

    public void executeAction(Request request){
        System.out.println("Send email with new request data");
    }
}
