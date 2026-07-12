package com.cognizant.practice.patterns.structural;

public class PrinterAdapter implements Printer {
    LegacyPrinter lp;

    public PrinterAdapter(LegacyPrinter lp) {
        this.lp = lp;
    }

    public void print(String msg) {
        lp.printOld(msg);
    }
}
