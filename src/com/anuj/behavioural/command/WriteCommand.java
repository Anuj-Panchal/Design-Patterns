package com.anuj.behavioural.command;

public class WriteCommand implements Command{

    private final TextEditor textEditor;

    private String text;

    public WriteCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    public WriteCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.write(text);
    }

    @Override
    public void undo() {
        textEditor.undoWrite(text);
    }

    public void setText(String text) {
        this.text = text;
    }
}
