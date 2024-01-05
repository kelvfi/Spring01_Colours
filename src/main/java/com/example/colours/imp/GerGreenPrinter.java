package com.example.colours.imp;

import com.example.colours.GreenPrinter;
import org.springframework.stereotype.Component;

public class GerGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "Grün";
    }
}
