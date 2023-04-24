package ru.netology.service;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn816Amount174() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(174);
        int expected = 826;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn1000Amount0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999Amount1() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1Amount999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999Amount1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0Amount1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}