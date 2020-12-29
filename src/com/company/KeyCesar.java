package com.company;

public class KeyCesar {
    double[] keyFrequency = {8.01, 1.59, 4.54, 1.70, 2.98, 8.45, 0.04, 0.94, 1.65, 7.35, 1.21, 3.49, 4.40, 3.21, 6.70,
          10.97, 2.81, 4.73, 5.47, 6.26, 2.62, 0.26, 0.97, 0.48, 1.44, 0.73, 0.36, 0.04, 1.90, 1.74, 0.32, 0.64, 2.01};
    double[] symbolFrequency = new double[33];
    double sumFrequency;
    double oldSumFrequency = 0.00;
    String text;
    String outText;
    int oldIndex;

    public void setSymbolFrequency(String keyText, String alphabet) {
        text = keyText;
        keyText = keyText.toLowerCase();
        for (int i = 0; i < alphabet.length(); i ++) {
            double k = 0.00;
            for (int j = 0; j < keyText.length(); j++) {
                if (keyText.charAt(j) == alphabet.charAt(i)) {
                    k++;
                }
            }
            symbolFrequency[i] = k;
        }
    }

    public void setOldSum(int i) {
        if (sumFrequency > oldSumFrequency) {
            oldSumFrequency = sumFrequency;
            outText = text;
            oldIndex = i;
        }
    }

    public String decodeText() {
        return outText;
    }

    public int getIndex() {
        return oldIndex;
    }

    public void getSumFrequency() {
        double sum = 0.00;
        for (int i = 0; i < symbolFrequency.length; i ++) {
            sum = sum + symbolFrequency[i] * keyFrequency[i];
        }
        sumFrequency = sum;
    }
}