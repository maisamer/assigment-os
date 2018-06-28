
public class Process {
	private String name;
	private int arrival;
	private int burst;
	boolean finish;
	int starttime;
	int finishtime;
	int priority;
	String alg;
	int remiantime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArrival() {
		return arrival;
	}
	public void setArrival(int arrival) {
		this.arrival = arrival;
	}
	public int getBurst() {
		return burst;
	}
	public void setBurst(int burst) {
		this.burst = burst;
	}
	
	

}
