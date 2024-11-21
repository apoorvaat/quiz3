package com.jwetherell.algorithms.mathematics.test;

import com.jwetherell.algorithms.mathematics.Primes;
import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class PrimesTest {

    @Test
    void testGetPrimeFactorizationRegularCases() {
        assertEquals(Map.of(2L, 2L, 3L, 1L), Primes.getPrimeFactorization(12));
        assertEquals(Map.of(5L, 1L, 7L, 1L), Primes.getPrimeFactorization(35));
        assertEquals(Map.of(2L, 1L), Primes.getPrimeFactorization(2));
        assertEquals(Map.of(13L, 1L), Primes.getPrimeFactorization(13));
    }

    @Test
    void testGetPrimeFactorizationEdgeCases() {
        assertTrue(Primes.getPrimeFactorization(1).isEmpty(), "Prime factorization of 1 should be empty");
        assertThrows(IllegalArgumentException.class, () -> Primes.getPrimeFactorization(0));
        assertThrows(IllegalArgumentException.class, () -> Primes.getPrimeFactorization(-10));
    }

    @Test
    void testIsPrimeRegularCases() {
        assertTrue(Primes.isPrime(2), "2 is a prime number");
        assertTrue(Primes.isPrime(3), "3 is a prime number");
        assertTrue(Primes.isPrime(17), "17 is a prime number");
        assertFalse(Primes.isPrime(4), "4 is not a prime number");
        assertFalse(Primes.isPrime(100), "100 is not a prime number");
    }

    @Test
    void testIsPrimeEdgeCases() {
        assertFalse(Primes.isPrime(0), "0 is not a prime number");
        assertFalse(Primes.isPrime(-7), "-7 is not a prime number");
        assertTrue(Primes.isPrime(Long.MAX_VALUE), "Long.MAX_VALUE is not a prime number");
    }

    @Test
    void testSieveOfEratosthenesRegularCases() {
        assertTrue(Primes.sieveOfEratosthenes(2), "2 is a prime number");
        assertTrue(Primes.sieveOfEratosthenes(3), "3 is a prime number");
        assertFalse(Primes.sieveOfEratosthenes(4), "4 is not a prime number");
        assertTrue(Primes.sieveOfEratosthenes(13), "13 is a prime number");
        assertFalse(Primes.sieveOfEratosthenes(100), "100 is not a prime number");
    }

    @Test
    void testSieveOfEratosthenesEdgeCases() {
        assertFalse(Primes.sieveOfEratosthenes(0), "0 is not a prime number");
        assertFalse(Primes.sieveOfEratosthenes(1), "1 is not a prime number");
        assertThrows(NegativeArraySizeException.class, () -> Primes.sieveOfEratosthenes(-10), "Negative numbers should throw exception");
    }

    @Test
    void testMillerRabinTestRegularCases() {
        assertTrue(Primes.millerRabinTest(2), "2 is a prime number");
        assertTrue(Primes.millerRabinTest(17), "17 is a prime number");
        assertFalse(Primes.millerRabinTest(18), "18 is not a prime number");
        assertTrue(Primes.millerRabinTest(19), "19 is a prime number");
        assertFalse(Primes.millerRabinTest(100), "100 is not a prime number");
    }

    @Test
    void testMillerRabinTestEdgeCases() {
        assertFalse(Primes.millerRabinTest(0), "0 is not a prime number");
        assertFalse(Primes.millerRabinTest(1), "1 is not a prime number");
        assertThrows(IllegalArgumentException.class, () -> Primes.millerRabinTest(-1), "Negative numbers should throw exception");
    }
}
