package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int totalAmount) {

        int maxBlueValue = 15_000;
        int bonusBlue = 50;

        int maxSilverValue = 150_000;
        int bonusSilver = 70;

        int bonusGold = 100;

        if (totalAmount == 0) {
            return 0;

        } else if (totalAmount <= maxBlueValue) {
            // blue card

            return purchaseAmount / 1000 * bonusBlue;

        } else if (totalAmount <= maxSilverValue) {
            // silver card

            return purchaseAmount / 1000 * bonusSilver;

        } else {
            // gold card

            return purchaseAmount / 1000 * bonusGold;
        }
    }
}
