package implementations;

import java.util.ArrayList;
import java.util.List;

public class SieveOfErastothenes
{
    private int size;
    private boolean[] primesCandidates;
    private List<Integer> listOfPrimes;

    public SieveOfErastothenes(int n)
    {
        this.size = n;
        this.primesCandidates = new boolean[n + 1]; //default is false
        listOfPrimes = new ArrayList<>();
    }

    private void generatePrimes(int n)
    {
        for(int i = 2; i <=n; i++)
        {
            for(int j = 2; j*i <=n; j++)
            {
                primesCandidates[i * j] = true;
            }
        }
        this.fillListWithPrimes();
    }

    private void fillListWithPrimes()
    {
        for(int i = 2; i <=this.size; i++)
        {
            if(!primesCandidates[i])
            {
                listOfPrimes.add(i);
            }
        }
    }
}
