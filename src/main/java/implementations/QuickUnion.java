package implementations;

public class QuickUnion
{
    private int N;
    private int tab[];
    private int size[];

    public QuickUnion(int n)
    {
        int N = n;
        tab = new int[N];
        size = new int[N];
        for(int i = 0; i < N; i++)
        {
            tab[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i)
    {
        while(tab[i] != i)
        {
            tab[i] = tab[tab[i]]; // To make tree more flat, root of i = root of root of i
            i = tab[i];
        }
        return i;
    }

    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }

    public void union(int p, int q)
    {
        int rootP = root(p);
        int rootQ = root(q);

        if(size[rootP] < size[rootQ]) // comparing sizes of trees
        {
            tab[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }

        else
        {
            tab[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
    }
}