import edu.princeton.cs.algs4.StdOut;

//Quick-find
public class quick_find {
	private int[] id;
	private int count;
	public quick_find(int n) 
	{
		count=n;
		id = new int [n];
		for (int i=0;i<n;i++) {
			id[i] = i;
		}
	}
	public int count () 
	{
		return count;
	}
	public int find(int a)
	{
		return id[a];
	}
	public void union(int a,int b)
	{
		int pid = find(a);
		int qid = find(b);
		if (pid == qid )return;
		for (int i=0;i<id.length;i++)
		{
			if(id[i]==pid) id[i] = qid;
		}
		count--;
	}
	public boolean connected(int a ,int b)
	{
		return find(a)==find(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quick_find test = new quick_find(6);
		test.union(0, 3);
		test.union(3, 4);
		StdOut.print(test.connected(0, 4));
	}

}
