package com.company;

public class Alphabet {
    public static final String UPPER_CASE_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String LOWER_CASE_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private final StringBuilder text;

    public Alphabet(StringBuilder text) {
        this.text = text;
    }

    public StringBuilder moveText() {
        int upperCaseIndex;
        int lowerCaseIndex;
        for (int i = 0; i < text.length(); i++) {
            upperCaseIndex = UPPER_CASE_ALPHABET.indexOf(text.charAt(i)) + 1;
            if (upperCaseIndex > 0) {
                if (upperCaseIndex != 33) {
                    text.deleteCharAt(i).insert(i, UPPER_CASE_ALPHABET.charAt(upperCaseIndex));
                } else {
                    text.deleteCharAt(i).insert(i, UPPER_CASE_ALPHABET.charAt(0));
                }
            }
            lowerCaseIndex = LOWER_CASE_ALPHABET.indexOf(text.charAt(i)) + 1;
            if (lowerCaseIndex > 0) {
                if (lowerCaseIndex != 33) {
                    text.deleteCharAt(i).insert(i, LOWER_CASE_ALPHABET.charAt(lowerCaseIndex));
                } else {
                    text.deleteCharAt(i).insert(i, LOWER_CASE_ALPHABET.charAt(0));
                }
            }
        }
        return text;
    }
}