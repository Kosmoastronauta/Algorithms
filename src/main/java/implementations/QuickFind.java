package implementations;

public class QuickFind //n^2
{
    private int tab[];
    private int N;

    QuickFind(int n)
    {
        N = n;
        tab = new int[n];
        for(int i = 0; i < n; i++)
        {
            tab[i] = i;
        }
    }

    public boolean connected(int p, int q)
    {
        return tab[p] == tab[q];
    }

    public void union(int p, int q)
    {
        int pid = tab[p];
        int qid = tab[q];

        for(int i = 0; i < N; i++)
        {
            if(tab[i] == pid) tab[i] = qid;
        }
    }
}



