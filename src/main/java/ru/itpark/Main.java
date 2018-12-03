package ru.itpark;

import ru.itpark.service.BonusService;

public class Main {
    public static void main(String[] args) {

        int purchaseAmount = 1_900;
        int lastTotalAmount = 65_000;
        BonusService bonusService = new BonusService();
        int bonus = bonusService.calculateBonus(purchaseAmount, lastTotalAmount);

        System.out.println(bonus);
    }
}
