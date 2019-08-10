import implementations.QuickUnion;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int p;
        int q;
        System.out.print("Type number of nodes: ");
        int n = input.nextInt();
        QuickUnion unionFind = new QuickUnion(n);

        System.out.println("Type " + n + " connections between nodes (p q)");
        for(int i = 0; i < n; i++)
        {
            p = input.nextInt();
            q = input.nextInt();
            unionFind.union(p, q);
        }

        System.out.println("Check connection: ");
        p = input.nextInt();
        q = input.nextInt();
        System.out.println(unionFind.connected(p, q));
    }
}