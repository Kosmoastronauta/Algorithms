package implementations;

import org.junit.Before;
import org.junit.BeforeClass;

public class SieveOfErastothenesTest
{
    private static SieveOfErastothenes sieve;

    @BeforeClass
    private static void setup()
    {
        sieve = new SieveOfErastothenes();
    }
}
