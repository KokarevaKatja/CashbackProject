package ru.netology.unit;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashBackHackerService;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalcRemainIfAmount800() {

        CashBackHackerService service = new CashBackHackerService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount50() {

        CashBackHackerService service = new CashBackHackerService();
        int amount = 50;

        int actual = service.remain(amount);
        int expected = 950;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount999() {

        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount1001() {

        CashBackHackerService service = new CashBackHackerService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount2000() {

        CashBackHackerService service = new CashBackHackerService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount0() {

        CashBackHackerService service = new CashBackHackerService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount1000() {

        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount1500() {

        CashBackHackerService service = new CashBackHackerService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }
}