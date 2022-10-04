package TDD.Arithmetic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArithmeticsTest {
    Aritmetics expressions;

    @BeforeEach
    void setUp() {
        expressions = new Aritmetics();
    }
    @Test
    void objectExitsTest(){
        assertNotNull(expressions);
    }
    @Test
    void numberAdditionTest(){
        assertEquals(15, expressions.addition(1,2,3,4,5));
    }
    @Test
    void numberSubtractionTest(){
        assertEquals(4, expressions.subtraction(15,3,1,0,7));
    }
    @Test
    void numberMultiplicationTest(){
        assertEquals(120, expressions.multiplication(1,2,3,4,5));
    }
    @Test
    void numberDivisionTest(){
        assertEquals(5, expressions.division(45,9));
    }
    @Test
    void divisionRemainderTest(){
        assertEquals(4, expressions.modulus(11,7));
    }
    @Test
    void numberAverageTest(){
        assertEquals(3, expressions.average(1,2,3,4,5));
    }
    @Test
    void maximumNumberTest(){
        assertEquals(5, expressions.maximumNumber(1,2,3,4,5));
    }
    @Test
    void minimumNumberTest(){
        assertEquals(1, expressions.minimumNumber(1,2,3,4,5));
    }
    @Test
    void numberExponentialTest(){
        assertEquals(9, expressions.exponential(3,2));
    }
    @Test
    void numberSquareRootTest(){
        assertEquals(7, expressions.squareRoot(49));
    }
    @Test
    void sumOfSquaresTest() {
        assertEquals(13, expressions.squareSum(2,3));
    }
    @Test
    void differenceOfSquares() {
        assertEquals(5, expressions.squareDifference(3,2));
    }
    @Test
    void greaterThanTest() {
        assertTrue(expressions.greaterThan(150));
        // Comparing the square of 'n' with 100
        assertTrue(expressions.squareGreaterThan(11));
    }
    @Test
    void lesserThanTest() {
        assertTrue(expressions.lesserThan(10));
        // Comparing the square of 'n' with 100
        assertTrue(expressions.squareLesserThan(9));
    }
}