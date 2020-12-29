package com.company;

public class Alphabet {
    final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    String[] textRes;
    String wordRes;
    String[] symbolWordRes;
    String symbolRes;

    public void moveSymbol(int nextSymbol) {
        symbolRes = symbolRes.toLowerCase();
        if (alphabet.indexOf(symbolRes) + nextSymbol < 33) {
            symbolRes = String.valueOf(alphabet.charAt(alphabet.indexOf(symbolRes) + nextSymbol));
        } else {
            symbolRes = String.valueOf(alphabet.charAt(alphabet.indexOf(symbolRes) + nextSymbol - 33));
        }
    }

    public void getSymbol(int j) {
        symbolWordRes[j] = symbolRes;
    }

    public void getWord(int i) {
        textRes[i] = wordRes;
    }

    public void setWord(int i) {
        wordRes = textRes[i];
    }

    public void setSymbol(int j) {
        symbolRes = symbolWordRes[j];
    }

    public void setText(String res) {
        textRes = res.split(" ");
    }

    public String getText() {
        return String.join(" ", textRes);
    }

    public void setSymbolWordRes() {
        symbolWordRes = wordRes.split("");
    }

    public void getSymbolWordRes() {
        wordRes = String.join("", symbolWordRes);
    }

    public boolean isSymbol() {
        return !symbolRes.equals(",") && !symbolRes.equals(".") && !symbolRes.equals("\n");
    }

    public boolean hasUpperCase() {
        return alphabet.contains(symbolRes);
    }

    public void setUpperCase() {
        symbolRes = symbolRes.toUpperCase();
    }
}