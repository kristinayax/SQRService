package ru.netology.sqr.squaresproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void calcNumberOfSqrsExact() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcNumbers(100, 200);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcNumberOfSqrsInexact() {
        SQRService service = new SQRService();

        int expected = 13;
        int actual = service.calcNumbers(100, 500);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcNumberOfSqrsAnother() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcNumbers(100, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcNumberOfSqrsAnother1() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcNumbers(10, 100);

        Assertions.assertEquals(expected, actual);
    }


}