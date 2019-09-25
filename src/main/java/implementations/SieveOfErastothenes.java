package implementations;

public class SieveOfErastothenes
{
    private int size;
    private boolean[] primes;

    public SieveOfErastothenes(int n)
    {
        this.size = n;
        this.primes = new boolean[n + 1];
    }


}
