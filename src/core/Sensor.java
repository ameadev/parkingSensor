package core;

import java.util.Random;

public class Sensor {

	private int id;
	private int range;
	private int rate;
	private String opt;
	
	public Sensor(int id, int range, int rate) {
		super();
		this.id = id;
		this.range = range;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}
	
	public void readParkingSensorData() {
		
		//
		Random randomGene = new Random();
		
		setOpt(id+":R"+range+"_P"+randomGene.nextInt(2)+":OPT");
		
	}
	
	
}
