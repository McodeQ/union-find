import edu.princeton.cs.algs4.StdOut;

public class quick_union {
	private int id[];
	private int count;
	public quick_union(int n)
	{
		id = new int [n];
		count= n;
		for (int i =0;i<n;i++) {
			id[i] = i;
		}
	}
	public int count()
	{
		return count;
	}
	public int find(int i)
	{
		while(i!=id[i]) i = id[i];
		return i;
	}
	public void union(int a, int b)
	{
		int aroot = find(a);
		int broot = find(b);
		if (aroot == broot)return ;
		id[aroot] = broot;
		count--;
	}
	public boolean connected(int a,  int b)
	{
		return find(a) == find(b);
	}
	public static void main(String[] args)
	{
		quick_union test = new  quick_union(5);
		test.union(0, 4);
		test.union(4,2);
		StdOut.print(test.connected(0,1));
	}
}
