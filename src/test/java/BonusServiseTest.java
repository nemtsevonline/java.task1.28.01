import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiseTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusServise service = new BonusServise();
// подготавливаемданные:
        long amount = 1000_60;
        boolean registered = true;long expected = 30;
// вызываемцелевойметод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusServise service = new BonusServise();
// подготавливаемданные:
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;
// вызываемцелевойметод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateUnregisteredAndUnderLimit() {
        BonusServise service = new BonusServise();
// подготавливаемданные:
        long amount = 1000_60;
        boolean registered = false;long expected = 10;
// вызываемцелевойметод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateUnregisteredAndOverLimit() {
        BonusServise service = new BonusServise();
// подготавливаемданные:
        long amount = 9000_000_60;
        boolean registered = false;
        long expected = 500;
// вызываемцелевойметод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
}
}