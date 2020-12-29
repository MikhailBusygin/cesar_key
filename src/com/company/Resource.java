package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resource {
    public String readFileFromResources() {
        String dataIO = "";
        try {
            FileReader fr = new FileReader("text.txt");
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();
            for (Object line : lines) {
                dataIO = dataIO.concat(line.toString() + "\n");
            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
        return dataIO;
    }
}
