package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;


public class Resource {
    public String readFileFromResources() {
        try {
            return new BufferedReader(new FileReader("text.txt")).lines()
                    .collect(Collectors.joining("\n"));
        } catch (IOException ioEx) {
            return "null";
        }
    }
}
