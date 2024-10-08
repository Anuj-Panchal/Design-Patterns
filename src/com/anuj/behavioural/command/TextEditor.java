package com.anuj.behavioural.command;

public class TextEditor {

    private StringBuilder sb;

    public TextEditor() {
        sb = new StringBuilder();
    }

    void write(String text) {
        sb.append(text);
    }

    void undoWrite(String text) {
        int ind = sb.indexOf(text);
        if(ind != -1) {
            sb.delete(ind, ind + text.length());
        }
    }

    public String getContent() {
        return sb.toString();
    }
}
