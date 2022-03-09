package com.company;

public class KeyCesar {
    private final double[] keyFrequency =
            {8.01, 1.59, 4.54, 1.70, 2.98, 8.45, 0.04, 0.94, 1.65, 7.35, 1.21, 3.49, 4.40, 3.21, 6.70, 10.97, 2.81,
                    4.73, 5.47, 6.26, 2.62, 0.26, 0.97, 0.48, 1.44, 0.73, 0.36, 0.04, 1.90, 1.74, 0.32, 0.64, 2.01};
    private double outFrequency = 0.00;
    private String outText;
    private final Alphabet alphabet;

    public KeyCesar(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public void decodeText() {
        for (int i = 0; i < 33; i++) {
            matchFrequency(alphabet.moveText());
        }
        System.out.println("Исходный текст:\n" + outText);
    }

    public void matchFrequency(StringBuilder text) {
        double frequency = 0.00;
        for (int i = 0; i < 33; i ++) {
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == Alphabet.LOWER_CASE_ALPHABET.charAt(i) ||
                        text.charAt(j) == Alphabet.LOWER_CASE_ALPHABET.charAt(i)) {
                    frequency += keyFrequency[i];
                }
            }
        }
        if (frequency > outFrequency) {
            outFrequency = frequency;
            outText = text.toString();
        }
        System.out.println(text);
    }
}