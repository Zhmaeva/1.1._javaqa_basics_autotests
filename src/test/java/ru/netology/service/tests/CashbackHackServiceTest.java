package ru.netology.service.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldNotGetCashbackLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(850);
        int expected = 150;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldGetCashbackEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldGetCashbackMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);

    }
}
