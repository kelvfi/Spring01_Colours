package com.example.colours.imp;

import com.example.colours.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class GerRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Rot";
    }
}
