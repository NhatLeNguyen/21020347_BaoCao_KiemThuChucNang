import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void test1() throws Exception {
        assertEquals(BMI.calculateBMI(17.5), "Underweight");
    }

    @org.junit.jupiter.api.Test
    void test2() throws Exception {
        assertEquals(BMI.calculateBMI(20), "Normal");
    }

    @org.junit.jupiter.api.Test
    void test3() throws Exception {
        assertEquals(BMI.calculateBMI(25), "Normal");
    }

    @org.junit.jupiter.api.Test
    void test4() throws Exception {
        assertEquals(BMI.calculateBMI(30), "Overweight");
    }

    @org.junit.jupiter.api.Test
    void test5() throws Exception {
        assertEquals(BMI.calculateBMI(-1), "ValueError");
    }
}