package implementations;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Random;

public class SieveOfErastothenesTest
{
    private static SieveOfErastothenes sieve;
    private static Random random;

    @BeforeClass
    public static void setup()
    {
        sieve = new SieveOfErastothenes();
        random = new Random();
    }

    @Test(expected = InvalidParameterException.class)
    public void negativeNumberInGetPrime()
    {
        sieve.getPrime(random.nextInt(50) - 100);
    }

    @Test
    public void firstPrimeNumberIs2()
    {
        Assert.assertEquals(Long.valueOf(2),sieve.getPrime(0));
    }

    @Test
    public void oneHundredPrimeEquals()
    {
        Assert.assertEquals(Long.valueOf(547),sieve.getPrime(100));
    }
}
