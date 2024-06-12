package com.anuj.behavioural.chainOfResponsibility;

public class L1SupportHandler implements ISupportHandler{
    private final ISupportHandler nextHandler;

    public L1SupportHandler() {
        nextHandler = null;
    }

    public L1SupportHandler(ISupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleIssue(String issue, int severity) {
        if(severity <= 1) {
            System.out.println("L1 Support Handler fixing issue");
        }else if(nextHandler != null) {
            nextHandler.handleIssue(issue, severity);
        }
    }
}
