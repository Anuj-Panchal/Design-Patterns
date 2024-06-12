package com.anuj.behavioural.chainOfResponsibility;

public class L3SupportHandler implements ISupportHandler{
    private final ISupportHandler nextHandler;

    public L3SupportHandler() {
        nextHandler = null;
    }

    public L3SupportHandler(ISupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleIssue(String issue, int severity) {
        if(severity == 3) {
            System.out.println("L3 Support Handler fixing issue");
        }else if(nextHandler != null) {
            nextHandler.handleIssue(issue, severity);
        }
    }
}
