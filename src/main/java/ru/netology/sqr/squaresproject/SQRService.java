package ru.netology.sqr.squaresproject;

public class SQRService {

    public int calcNumbers(int lowerBound, int upperBound) {
        int numberOfSqrs = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBound) {
                if (i * i <= upperBound) {
                    numberOfSqrs++;
                    continue;
                }
            }
        }
        return numberOfSqrs;
    }
}
