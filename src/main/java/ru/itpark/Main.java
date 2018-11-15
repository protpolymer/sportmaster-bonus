package ru.itpark;

public class Main {
    public static void main(String[] args) {

        int purchaseAmount = 1_900;
        int totalAmount = 65_000;
        BonusService bonusService = new BonusService();
        int bonus = bonusService.calculateBonus(purchaseAmount, totalAmount);

        System.out.println(bonus);
    }
}
