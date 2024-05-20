package com.anuj.structural.adapter;

import com.anuj.structural.adapter.legacy.LegacyPrinter;

public class PrinterAdapter implements IPrinter{
    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
}
