package ru.itpark;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void calculateBonus() {
        {
            //Positive test for blue card

            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(1_200, 14_598);

            assertEquals(50, bonus);
        }
        {
            //Positive test for silver card

            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(2_200, 44_598);

            assertEquals(140, bonus);
        }
        {
            //Positive test for gold card

            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(2_200, 164_598);

            assertEquals(200, bonus);
        }
    }
}