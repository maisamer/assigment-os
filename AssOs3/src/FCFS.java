
public class FCFS {
	private int size;
	private Process q[];
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Process[] getQ() {
		return q;
	}
	public void setQ(Process q[]) {
		this.q = q;
	}
	public FCFS(Process q[])
	{
		this.q = q;
	}
	public FCFS()
	{
		
	}
	public void excute()
	{
		int sum=0;
		int wait=0;
		int total=0;
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			if(flag)
			{
				wait=total-q[i].getArrival();
			}
			wait+=q[i].getBurst();
			total+=q[i].getBurst();
			flag=true;
			System.out.println(q[i].getName()+" "+wait);
			sum+=wait;

		}
		System.out.println("Average Turnaround Time = "+(double)sum/size);
	}
	public void execution_order()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(q[i].getName()+" ");
		}
		System.out.println();
	}
	public void allFunction()
	{
		execution_order();
		excute();
	}
	
	

}
