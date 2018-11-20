package ru.itpark;

public class BonusService {
    public int calculateBonus(double purchaseAmount, double totalAmount) {
        int result = 0;

        int minBlueValue = 1;
        int maxBlueValue = 15_000;
        int bonusBlue = 50;

        int minSilverValue = 15_001;
        int maxSilverValue = 150_000;
        int bonusSilver = 70;

        int bonusGold = 100;

        if (totalAmount == 0) {
            result = 0;

        } else if (totalAmount >= minBlueValue && totalAmount <= maxBlueValue) {
            // blue card

            result = (int)purchaseAmount / 1000 * bonusBlue;

        } else if (totalAmount >= minSilverValue && totalAmount <= maxSilverValue) {
            // silver card

            result = (int)purchaseAmount / 1000 * bonusSilver;

        } else {
            // gold card

            result = (int)purchaseAmount / 1000 * bonusGold;
        }
        return result;
    }
}
