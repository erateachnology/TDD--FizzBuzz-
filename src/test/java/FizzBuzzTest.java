import org.example.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {

    private static FizzBuzz fizzBuzz;

    @BeforeAll
    public static void intSetUp() {
        fizzBuzz = new FizzBuzz();
    }


    @DisplayName("Divisible by three")
    @Test
    @Order(1)
    void testDivisibleByThree() {

        assertEquals("Fizz", fizzBuzz.compute(3), "Should return Fizz");
    }

    @DisplayName("Divisible by five")
    @Test
    @Order(2)
    void testDivisibleByFive() {

        assertEquals("Buzz", fizzBuzz.compute(5), "Should return Buzz");
    }

    @DisplayName("Divisible by three and five")
    @Test
    @Order(3)
    void testDivisibleByThreeAndFive() {

        assertEquals("FizzBuzz", fizzBuzz.compute(15), "Should return FizzBuzz");
    }

    @DisplayName("Cannot divisible by three and five")
    @Test
    @Order(4)
    void testCannotDivisibleByThreeAndFive() {

        assertEquals("1", fizzBuzz.compute(1), "Should return 1");
    }


}
