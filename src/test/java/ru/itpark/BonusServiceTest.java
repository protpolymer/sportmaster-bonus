package ru.itpark;

import org.junit.jupiter.api.Test;
import ru.itpark.service.BonusService;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
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
        {
            //Positive test for zero total amount purchases

            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(1_000, 0);

            assertEquals(0, bonus);
        }
    }
}