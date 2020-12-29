package com.company;

public class Main {

    public static void main(String[] args) {
        Resource res = new Resource();
        String inData = res.readFileFromResources();
        String outData;

        Alphabet alphabetRes = new Alphabet();
        String codeMax = alphabetRes.alphabet;
        KeyCesar keyCesar = new KeyCesar();

        for (char codeChar : codeMax.toCharArray()) {
            int codeIndex = codeMax.indexOf(String.valueOf(codeChar));
            alphabetRes.setText(inData);
            for (int i = 0; i < alphabetRes.textRes.length; i++) {
                alphabetRes.setWord(i);
                alphabetRes.setSymbolWordRes();
                for (int j = 0; j < alphabetRes.symbolWordRes.length; j++) {
                    alphabetRes.setSymbol(j);
                    if (alphabetRes.isSymbol()) {
                        if (alphabetRes.hasUpperCase()) {
                            alphabetRes.moveSymbol(codeIndex);
                            alphabetRes.getSymbol(j);
                        } else {
                            alphabetRes.moveSymbol(codeIndex);
                            alphabetRes.setUpperCase();
                            alphabetRes.getSymbol(j);
                        }
                    } else {
                        j++;
                    }
                }
                alphabetRes.getSymbolWordRes();
                alphabetRes.getWord(i);
            }
            outData = alphabetRes.getText();
            System.out.println(outData);
            keyCesar.setSymbolFrequency(outData, alphabetRes.alphabet);
            keyCesar.getSumFrequency();
            keyCesar.setOldSum(codeIndex);
        }
        System.out.println("Найденный ключ от Шифра Цезаря: " + keyCesar.getIndex());
        System.out.println("Исходный текст после подстановки найденного ключа:\n" + keyCesar.decodeText());
    }
}
