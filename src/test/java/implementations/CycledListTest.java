package implementations;

import org.junit.Assert;
import org.junit.Test;

public class CycledListTest
{
    @Test
    public void IsInitializedListEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        Assert.assertTrue(list.isEmpty());
    }
    @Test
    public void AddFrontPopBackIsEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addFront(2);
        list.popBack();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void AddFrontPopFrontIsEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addFront(2);
        list.popFront();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void AddBackPopBackIsEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addBack(2);
        list.popBack();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void AddBackPopFrontIsEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addBack(2);
        list.popFront();
        Assert.assertTrue(list.isEmpty());
    }
}