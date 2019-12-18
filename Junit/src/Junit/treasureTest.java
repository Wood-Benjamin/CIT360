package Junit;

import org.junit.*;
import static org.junit.Assert.*;

public class treasureTest {

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("Test is Ready");
    }

    @Before
    public void beforeTest() {
        System.out.println("Begin Test");
    }

    @Test
    public void failTest() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Jewelry Box", treasureChest.jewlChest);
        double amount = myTreasureChest.gifts(60.0D);
        Assert.fail("Test: getAmount() - FAILED");
    }

    @Test
    public void gifts() {
        treasureChest myTreaserChest = new treasureChest(300.0D, "Jewelry Box", treasureChest.jewlChest);
        double amount = myTreaserChest.gifts(60.0D);
        Assert.assertEquals(360.0D, amount, 0.0D);
    }

    @Test
    public void theft() {
        treasureChest myTreaserChest = new treasureChest(300.0D, "Jewelry Box", treasureChest.jewlChest);
        double amount = myTreaserChest.theft(60.0D);
        Assert.assertEquals(240.0D, amount, 0.0D);
    }

    @Test
    public void getAmount_gifts() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Jewelry Box", treasureChest.jewlChest);
        myTreasureChest.gifts(60.0D);
        Assert.assertEquals(360.0D, myTreasureChest.getAmount(), 0.0D);
    }

    @Test
    public void getAmount_theft() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Jewelry Box", treasureChest.jewlChest);
        myTreasureChest.theft(300.0D);
        Assert.assertEquals(0.0D, myTreasureChest.getAmount(), 0.0D);
    }

    @Test
    public void isJewlChestTrue() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Jewelry Box", treasureChest.jewlChest);
        assertTrue(treasureChest.isJewlChest());
    }

    @Test
    public void isJewlChestFalse() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Jewelry Box", treasureChest.coinChest);
        assertFalse("Not a Jewelry Box", treasureChest.isJewlChest());
    }

    @Test
    public void assertfalse() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Jewelry Box", treasureChest.coinChest);
        assertFalse("Not a Jewelry Box", treasureChest.isJewlChest());
    }

    @Test
    public void isCoinChestTrue() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Coin Box", treasureChest.coinChest);
        assertTrue(treasureChest.isCoinChest());
    }

    @Test
    public void isCoinChestFalse() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Coin Box", treasureChest.jewlChest);
        assertFalse("Not a Coin Box", treasureChest.isCoinChest());
    }
    //pass - box is full
    @Test
    public void notNull() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Jewwlry Box", treasureChest.jewlChest);
        assertNotNull(myTreasureChest);
    }
    //fail - box is full
    @Test
    public void Null() {
        treasureChest myTreasureChest = new treasureChest(300.0D, "Jewwlry Box", treasureChest.jewlChest);
        assertNull(myTreasureChest);
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("End of Test");
    }


}
