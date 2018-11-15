package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int totalAmount) {
        int result = 0;

        int minBlueValue = 1;
        int maxBlueValue = 15_000;
        int bonusBlue = 50;

        int minSilverValue = 15_001;
        int maxSilverValue = 150_000;
        int bonusSilver = 70;

        int bonusGold = 100;

        if (totalAmount >= minBlueValue && totalAmount <= maxBlueValue) {
            // blue card

            result = purchaseAmount / 1000 * bonusBlue;

        } else if (totalAmount >= minSilverValue && totalAmount <= maxSilverValue) {
            // silver card

            result = purchaseAmount / 1000 * bonusSilver;

        } else {
            // gold card

            result = purchaseAmount / 1000 * bonusGold;
        }
        return result;
    }
}
