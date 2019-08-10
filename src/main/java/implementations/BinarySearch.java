package implementations;

public class BinarySearch
{
    public static int find(int tab[], int n)
    {
        int lo = 0;
        int hi = tab.length - 1;
        int mid;
        while(lo<=hi)
        {
            mid = (lo + hi) / 2;
            if(n<tab[mid]) hi = mid - 1;
            else if(n > tab[mid]) lo = mid + 1;
            else return mid;    //equal
        }
        return -1;
    }
}
