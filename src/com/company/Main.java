package com.company;

public class Main {

    public static void main(String[] args) {
        new KeyCesar(new Alphabet(new StringBuilder(new Resource().readFileFromResources()))).decodeText();
    }
}
