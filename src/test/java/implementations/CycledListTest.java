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
    public void oneElementFrontAndBackIsTheSameAddBack()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addBack(1);
        //Then
        Assert.assertEquals(list.getBack(),list.getFront());
    }

    @Test
    public void oneElementFrontAndBackIsTheSameAddFront()
    {
        //Given
        //When
        CycledList<Integer> list = new CycledList<>();
        list.addFront(1);
        //Then
        Assert.assertEquals(list.getBack(),list.getFront());
    }

    @Test
    public void add10ElementsBackAndPopBackAndIsEmpty()
    {
        //Given
        //When
        CycledList list = new CycledList();
        for(int i = 0; i < 10; i++)
        {
            list.addBack(i);
        }
        for(int i = 0; i < 10; i++)
        {
            list.popBack();
        }
        //Then
        Assert.assertTrue(list.isEmpty());

    }

    @Test
    public void add10ElementsBackAndPopFrontAndIsEmpty()
    {
        //Given
        //When
        CycledList list = new CycledList();
        for(int i = 0; i < 10; i++)
        {
            list.addBack(i);
        }
        for(int i = 0; i < 10; i++)
        {
            list.popFront();
        }
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
        Assert.assertEquals(Integer.valueOf(2),list.getFront());
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
        Assert.assertEquals(Integer.valueOf(4),list.getBack());
    }
}
