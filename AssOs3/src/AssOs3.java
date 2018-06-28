import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AssOs3 {
	static int systime=0;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Scanner a=new Scanner(System.in);
		Scanner b=new Scanner(System.in);
		Scanner c=new Scanner(System.in);
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the number of queues:");
		int Num_Queues=s.nextInt();
		Process []ready=new Process[1000];
		Process []all=new Process[10000];
		ArrayList<queues> myQueues = new ArrayList<>();
		
		
		//add the queues at the arrayList
		for(int i=0;i<Num_Queues;i++)
		{
			queues obj=new queues();
			System.out.println("Enter the priority of the Q:"+i);
			obj.priroity=a.nextInt();
			System.out.println("Enter the Algorithm of the Q:"+i);
			obj.alg=b.nextLine();
			System.out.println("Enter the number of processes of the Q:"+i);
			obj.numofprocess=c.nextInt();
			myQueues.add(obj);
		}
		int counter=0;
		for(int i=0;i<Num_Queues;i++)
		{
			Scanner n=new Scanner(System.in);
			Scanner arr=new Scanner(System.in);
			Scanner bur=new Scanner(System.in);
			queues tem=new queues();
			tem=myQueues.get(i);
			for(int j=0;j<tem.numofprocess;j++)
			{
				System.out.println("Enter the name of the process :");
				all[counter]=new Process();
				all[counter].setName(n.nextLine());
				all[counter].setArrival(arr.nextInt());
				all[counter].setBurst(bur.nextInt());
				all[counter].alg=tem.alg;
				all[counter].priority=tem.priroity;
				counter++;	
			}
		}
		while (true)
		{
			ready=readyProcess(all,counter);
			if("FCFS".equals(ready[0].alg))
			{
				if(ready[0].remiantime==0)
					ready[0].starttime=systime;
				
			}
			systime++;
		}
		
		
	}
	public static Process []readyProcess(Process all[],int size)
	{
		Process []res=new Process[1000];
		for(int i=0;i<size;i++)
		{
			if(all[i].getArrival()>systime)
				break;
			res[i]=all[i];
		}
		return res;
	}
}













































/*public static void main(String[] args) throws FileNotFoundException {
		int context=0;
		int q=0;
		String[] allinput=new String [1000];
		ArrayList<queues> myQueues = new ArrayList<>();
		File f=new File("input.txt");
		Scanner file=new Scanner(f);
		int index=0;
		while(file.hasNextLine())
		{
			allinput[index]=file.nextLine();
			index++;
		}
		file.close();
		int curr=1;
		int Num_Queues= Integer.parseInt(allinput[0]);
		for(int i=0;i<Num_Queues;i++)
		{
			queues obj=new queues();
			obj.priroity= Integer.parseInt(allinput[curr]);
			curr++;
			obj.alg=allinput[curr];
			curr++;
			obj.numofprocess=Integer.parseInt(allinput[curr]);
			curr++;
			myQueues.add(obj);
		}
		//////////////////////////////////////
		FCFS objf=new FCFS();
		//A3mlo Hena object mn el classes bt3tko
		for(int i=0;i<Num_Queues;i++)
		{
			int size=myQueues.get(i).numofprocess;
			Process p[]=new Process[size];
			for(int j=0;j<size;j++)
			{
				p[j]=new Process();
				p[j].setName(allinput[++curr]);
				p[j].setArrival(Integer.parseInt(allinput[++curr]));
				p[j].setBurst(Integer.parseInt(allinput[++curr]));
	
			}
			curr++;
			if(myQueues.get(i).alg.equals("FCFS"))
			{
				objf.setQ(p);
				objf.setSize(size);
			}
			else if(myQueues.get(i).alg.equals("SJF"))
			{
				//ado ll class al array of el process
			}
			else if(myQueues.get(i).alg.equals("RR"))
			{
				//ado ll class al array of el process
			}
			
		}
		//sort the arrayList according to the priority
		for(int i=0;i<myQueues.size();i++)
		{
			for(int j=i+1;j<myQueues.size();j++)
			{
				if(myQueues.get(i).priroity<myQueues.get(j).priroity)
				{
					queues temp=myQueues.get(i);
					myQueues.set(i,myQueues.get(j));
					myQueues.set(j, temp);
				}
			}
		}
		for(int i=0;i<Num_Queues;i++)
		{
			if(myQueues.get(i).alg.equals("FCFS"))
			{
				objf.allFunction();
				
			}
			else if(myQueues.get(i).alg.equals("SJF"))
			{
				//ado ll class al array of el process
			}
			else if(myQueues.get(i).alg.equals("RR"))
			{
				//ado ll class al array of el process
			}
			
		}
		
	}
		

	}

 */
