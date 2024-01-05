package com.example.colours.imp;

import com.example.colours.GreenPrinter;
import org.springframework.stereotype.Component;

/* @Component fügt sie quasi hinzu damit sie ausgegeben werden können. (Allgemeine Notation)
*  @Service ist quasi das gleiche nur es wird meist dort verwendet wo Logik enthalten ist.*/
@Component
public class EngGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "green";
    }
}
