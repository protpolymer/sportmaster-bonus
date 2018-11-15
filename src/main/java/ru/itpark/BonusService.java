package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int totalAmount) { // FIXME: придумать нормальное имя для totalAmount
        int result = 0;

        int minBlueValue = 1;
        int maxBlueValue = 15_000;
        int bonusBlue = 50;

        int minSilverValue = 15_001;
        int maxSilverValue = 150_000;
        int bonusSilver = 70;

        int bonusGold = 100;

        // TODO: убрать hardcoded значения в локальные переменные
        if (totalAmount >= minBlueValue && totalAmount <= maxBlueValue) {
            // TODO: blue card
            // TODO: calculate result

            result = purchaseAmount / 1000 * bonusBlue;

        } else if (totalAmount >= minSilverValue && totalAmount <= maxSilverValue) {
            // TODO: silver card
            // TODO: calculate result

            result = purchaseAmount / 1000 * bonusSilver;

        } else {
            // TODO: gold card
            // TODO: calculate result

            result = purchaseAmount / 1000 * bonusGold;

        }

        // Ctrl + Alt + L - выравнивание
        return result;
    }
}
