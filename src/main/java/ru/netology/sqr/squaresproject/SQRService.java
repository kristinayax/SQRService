package ru.netology.sqr.squaresproject;

public class SQRService {

    public int calcNumbers(int x, int y) {
        int a = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                if (i * i <= y) {
                    a++;
                    continue;
                }
            }
        }
        return a;
    }
}
