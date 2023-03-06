package chap02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {
    //길이가 8자이상
    //0~9 사이 숫자포함
    //대문자 포함
    // ----- 3개중 1개/약함 , 2개/보통, 3개/강함
    @Test
    void allCheckPasswordStrengthMeter(){
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength strength = meter.meter("ab12!@AB");
        assertEquals(PasswordStrength.STRONG,strength);
    }
}
