package ru.itpark;

public class Main {
    public static void main(String[] args) {

        double purchaseAmount = 1_900;
        double lastTotalAmount = 65_000;
        BonusService bonusService = new BonusService();
        int bonus = bonusService.calculateBonus(purchaseAmount, lastTotalAmount);

        System.out.println(bonus);
    }
}
