package ru.netology.sqr.squaresproject;

public class SQRService {

    public int calcNumbers(int upperBound, int lowerBound) {
        int numberOfSqrs = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= upperBound) {
                if (i * i <= lowerBound) {
                    numberOfSqrs++;
                    continue;
                }
            }
        }
        return numberOfSqrs;
    }
}
