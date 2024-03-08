package ru.netology.service.tests;


import ru.netology.service.CashbackHackService;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldNotGetCashbackLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(850);
        int expected = 150;

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldGetCashbackEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldGetCashbackMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);

    }
}
