package implementations;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest
{
    @Test
    public void evenNumberOfElementsExists()
    {
        int tab[] = {1, 5, 23, 53, 126};
        Assert.assertEquals(BinarySearch.find(tab,5),1);
    }

    @Test
    public void evenNumberOfElementsNotExists()
    {
        int tab[] = {1, 5, 23, 53, 126};
        Assert.assertEquals(BinarySearch.find(tab,16),-1);
    }

    @Test
    public void oddNumberOfElementsExists()
    {
        int tab[] = {1, 5, 23, 53, 126, 342};
        Assert.assertEquals(BinarySearch.find(tab,126),4);
    }

    @Test
    public void oddNumberOfElementsNotExists()
    {
        int tab[] = {1, 5, 23, 53, 126, 342};
        Assert.assertEquals(BinarySearch.find(tab,180),-1);
    }


}

