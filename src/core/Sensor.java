package core;

public class Sensor {

	private int id;
	private int range;
	private int rate;
	private String opt;
	
	public Sensor(int id, int range, int rate, String opt) {
		super();
		this.id = id;
		this.range = range;
		this.rate = rate;
		this.opt = opt;
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
		
		//ajouter accès à un fichier texte qui comporte l'état du parking
		
	}
	
	
}
