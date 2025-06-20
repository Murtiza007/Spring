package Beans;

public class Intel {

	private String threads;
	private String geneartion;
	private String clockspeed;
	
	public String getThreads() {
		return threads;
	}
	public void setThreads(String threads) {
		this.threads = threads;
	}
	public String getGeneartion() {
		return geneartion;
	}
	public void setGeneartion(String geneartion) {
		this.geneartion = geneartion;
	}
	public String getClockspeed() {
		return clockspeed;
	}
	public void setClockspeed(String clockspeed) {
		this.clockspeed = clockspeed;
	}
	@Override
	public String toString() {
		return clockspeed+","+threads+","+geneartion;
		
		
	}
	
}
