package Junit;

public class treasureChest {
    private static int chestType;
    private double amount;
    private String location;

public static final int jewlChest = 1;
public static final int coinChest = 2;

//constructor

    public treasureChest(double amount, String location, int chestType) {
        this.amount = amount;
        this.location = location;
        this.chestType = chestType;
    }

    public double gifts(double load) {
        amount += load;
        return amount;
    }

    public double theft(double load) {
        amount -= load;
        return amount;
    }

    public double getAmount() {
        return amount;
    }

    public static boolean isJewlChest() {
        return chestType == jewlChest;
    }

    public static boolean isCoinChest() {
        return chestType == coinChest;
    }
}
