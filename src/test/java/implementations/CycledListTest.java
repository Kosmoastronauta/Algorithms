package implementations;

import org.junit.Assert;
import org.junit.Test;

public class CycledListTest
{
    @Test
    public void isInitializedListEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        //Then
        Assert.assertTrue(list.isEmpty());
    }
    @Test
    public void addFrontPopBackIsEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addFront(2);
        list.popBack();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void addFrontPopFrontIsEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addFront(2);
        list.popFront();
        //Then
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void addBackPopBackIsEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addBack(2);
        list.popBack();
        //Then
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void addBackPopFrontIsEmpty()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addBack(2);
        list.popFront();
        //Then
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void checkIfFrontElementIsProperElement()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addFront(5);
        list.addBack(4);
        list.addFront(2);
        //Then
        Assert.assertEquals(new Integer(2),list.getFront());
    }

    @Test
    public void checkIfBackElementIsProperElement()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addFront(5);
        list.addBack(4);
        list.addFront(2);
        //Then
        Assert.assertEquals(new Integer(4),list.getBack());
    }
}