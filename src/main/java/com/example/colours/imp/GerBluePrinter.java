package com.example.colours.imp;

import com.example.colours.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class GerBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Blau";
    }
}
