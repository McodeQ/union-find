import edu.princeton.cs.algs4.StdOut;

public class Weight {
	private int [] id ;
	private int [] size;
	private int count;
	public Weight(int n)
	{
		count = n;
		id = new int [n];
		size = new int [n];
		for (int i=0;i<n;i++) {
			id[i] = i;
			size[i] = 1;
		}
	}
	public int count ()
	{
		return count;
	}
	public int find  (int i)
	{
		while(i!= id[i]) i = id[i];
		return i;
	}
	public void union(int a, int b)
	{
		int aroot = find(a);
		int broot = find(b);
		if (aroot == broot) return ;
		if (size[a]>size[b]) {
			id[broot] = aroot;
			size[a]+=size[b];
		}
		else
		{
			id[aroot] = broot;
			size[b]+=size[a];
		}
		count--;
	}
	public boolean connected(int a, int b)
	{
		return find(a) == find(b);
	}
	public static void main(String[] args)
	{
		Weight test = new Weight(5);
		test.union(0, 3);
		test.union(2, 4);
		StdOut.print(test.connected(0, 4));
	}
}
