package com.anuj.behavioural.chainOfResponsibility;

public class L2SupportHandler implements ISupportHandler{
    private final ISupportHandler nextHandler;

    public L2SupportHandler() {
        nextHandler = null;
    }

    public L2SupportHandler(ISupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleIssue(String issue, int severity) {
        if(severity == 2) {
            System.out.println("L2 Support Handler fixing issue");
        }else if(nextHandler != null) {
            nextHandler.handleIssue(issue, severity);
        }
    }
}
