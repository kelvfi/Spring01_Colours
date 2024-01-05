package com.example.colours.imp;

import com.example.colours.BluePrinter;
import com.example.colours.ColourPrinter;
import com.example.colours.GreenPrinter;
import com.example.colours.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    public String print(){
        return String.join(", ",redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
