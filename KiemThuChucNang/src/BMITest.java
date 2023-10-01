import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void test1() throws Exception {
        assertEquals(BMI.calculateBMI(10), "Underweight");
    }

    @org.junit.jupiter.api.Test
    void test2() throws Exception {
        assertEquals(BMI.calculateBMI(22), "Normal");
    }

    @org.junit.jupiter.api.Test
    void test3() throws Exception {
        assertEquals(BMI.calculateBMI(28), "Overweight");
    }

    @org.junit.jupiter.api.Test
    void test4() throws Exception {

        assertEquals(BMI.calculateBMI(-1), "ValueError");
    }

}