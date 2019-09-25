package implementations;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class SieveOfErastothenes
{
    private final int size = 500000000;
    private boolean[] primesCandidates;
    private List<Long> listOfPrimes;

    public SieveOfErastothenes()
    {
        this.primesCandidates = new boolean[this.size+1]; //default is false
        listOfPrimes = new ArrayList<>();
        this.generatePrimes();
    }

    public Long getPrime(int index) // gives nth prime number
    {
        try
        {
            return listOfPrimes.get(index);
        }catch(IndexOutOfBoundsException e)
        {
            throw new InvalidParameterException("Invalid number");
        }
    }

    private void generatePrimes()
    {
        for(int  i = 2; i*i <=this.size; i++)
        {
            if(!primesCandidates[i])
            {
                for(int j = i * i; j < this.size; j+=i)
                {
                    primesCandidates[j] = true;
                }
            }
        }
        this.fillListWithPrimes();
    }

    private void fillListWithPrimes()
    {
        for(int i = 2; i <=this.size; i++)
        {
            if(!this.primesCandidates[i])
            {
                this.listOfPrimes.add((long)i);
            }
        }
    }
}
